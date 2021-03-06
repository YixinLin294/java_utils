package com.shenlanbao.consult.utils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class EasyExcelUtils {
    public static <T> List<T> readExcel(MultipartFile file, T data) throws IOException {
        List<T> dataList = EasyExcel.read(file.getInputStream(), data.getClass(), new DataListener<T>()).sheet().doReadSync();
        return dataList;
    }
}


class DataListener<T> extends AnalysisEventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataListener.class);
    List<T> list = new ArrayList<>();

    public DataListener() {}

    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
        LOGGER.info("解析到一条数据:{}", JSON.toJSONString(o));
        list.add((T) o);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}

