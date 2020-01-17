package com.shenlanbao.consult.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.shenlanbao.consult.common.converter.LocalDateTimeConverter;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDB {

    private Integer id;
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime createdAt;
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime updatedAt;
    private String status;
    private Integer paymentOrderId;
    private Integer consultantId;
    private Integer consultantGroupId;
    private String wbStatus;
    private Integer customerId;
    private String channel;
    private String remark;
    private String followUpStatus;
    private String firstLevelStatus;
    private String secondLevelStatus;
    private String type;//业务类型
    private String productName;
    private String createdBy;
    private Boolean top;
    private Boolean deleted;
    private Integer preOrderId;

}
