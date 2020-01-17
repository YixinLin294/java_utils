package com.shenlanbao.consult.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.shenlanbao.consult.common.converter.LocalDateTimeConverter;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDB {

    @ExcelProperty(value = "id")
    private Integer id;
    @ExcelProperty(value = "id", converter = LocalDateTimeConverter.class)
    private LocalDateTime createdAt;
    @ExcelProperty(value = "update_at", converter = LocalDateTimeConverter.class)
    private LocalDateTime updatedAt;
    @ExcelProperty(value = "status")
    private String status;
    @ExcelProperty(value = "payment_order_id")
    private Integer paymentOrderId;
    @ExcelProperty(value = "consultant_id")
    private Integer consultantId;
    @ExcelProperty(value = "consultant_group_id")
    private Integer consultantGroupId;
    @ExcelProperty(value = "wbStatus")
    private String wbStatus;
    @ExcelProperty(value = "customer_id")
    private Integer customerId;
    @ExcelProperty(value = "channel")
    private String channel;
    @ExcelProperty(value = "remark")
    private String remark;
    @ExcelProperty(value = "follow_up_status")
    private String followUpStatus;
    @ExcelProperty(value = "first_level_status")
    private String firstLevelStatus;
    @ExcelProperty(value = "second_level_status")
    private String secondLevelStatus;
    @ExcelProperty(value = "type")
    private String type;//业务类型
    @ExcelProperty(value = "product_name")
    private String productName;
    @ExcelProperty(value = "created_by")
    private String createdBy;
    @ExcelProperty(value = "top")
    private Boolean top;
    @ExcelProperty(value = "deleted")
    private Boolean deleted;
    @ExcelProperty(value = "pre_order_id")
    private Integer preOrderId;

}
