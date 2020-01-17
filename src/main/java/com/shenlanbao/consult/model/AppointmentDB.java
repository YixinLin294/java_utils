package com.shenlanbao.consult.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.shenlanbao.consult.common.converter.LocalDateTimeConverter;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentDB {

    @ExcelProperty(value = "id")
    private Integer id;
    @ExcelProperty(value = "create_at", converter = LocalDateTimeConverter.class)
    private LocalDateTime createAt;
    @ExcelProperty(value = "update_at", converter = LocalDateTimeConverter.class)
    private LocalDateTime updateAt;
    @ExcelProperty(value = "start_time", converter = LocalDateTimeConverter.class)
    private LocalDateTime startTime;
    @ExcelProperty(value = "end_time", converter = LocalDateTimeConverter.class)
    private LocalDateTime endTime;
    @ExcelProperty(value = "title")
    private String title;
    @ExcelProperty(value = "user_id")
    private Integer userId;
    @ExcelProperty(value = "order_id")
    private Integer orderId;
}
