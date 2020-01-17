package com.shenlanbao.consult.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.shenlanbao.consult.common.converter.LocalDateTimeConverter;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentDB {

    private Integer id;
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime createAt;
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime updateAt;
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime startTime;
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime endTime;
    private String title;
    private Integer userId;
    private Integer orderId;
}
