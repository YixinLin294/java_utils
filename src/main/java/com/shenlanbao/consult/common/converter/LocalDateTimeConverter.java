package com.shenlanbao.consult.common.converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeConverter implements Converter<LocalDateTime> {

    @Override
    public Class supportJavaTypeKey() {
        return LocalDateTime.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.NUMBER;
    }

    @Override
    public LocalDateTime convertToJavaData(CellData cellData, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        Date javaDate = HSSFDateUtil.getJavaDate(cellData.getNumberValue().doubleValue(), false);
        LocalDateTime localDateTime = javaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return localDateTime;
    }

    @Override
    public CellData convertToExcelData(LocalDateTime localDateTime, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        double excelDate = HSSFDateUtil.getExcelDate(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));
        CellData cellData = new CellData();
        cellData.setType(CellDataTypeEnum.NUMBER);
        cellData.setNumberValue(BigDecimal.valueOf(excelDate));
        cellData.setFormula(false);
        cellData.setDataFormat(166);
        cellData.setDataFormatString("yyyy/M/d h:mm:ss");
        return cellData;
    }
}

