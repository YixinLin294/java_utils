package com.shenlanbao.consult.controller;

import com.shenlanbao.consult.common.exception.AppException;
import com.shenlanbao.consult.common.model.ApiResult;
import com.shenlanbao.consult.model.OrderDB;
import com.shenlanbao.consult.utils.EasyExcelUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class uploadController {

    @PostMapping("/order/upload_excel")
    public List<OrderDB> insertOrders(MultipartFile excelfile) {
        if (excelfile == null) {
            throw new AppException(ApiResult.STATE.UPLOAD_EXCEL_FAILD);
        }
        List<OrderDB> orderList = new ArrayList<>();
        try {
            orderList = EasyExcelUtils.readExcel(excelfile, new OrderDB());
        } catch (IOException e) {
            throw new AppException(ApiResult.STATE.PARSE_EXCEL_FAILD);
        }
        return orderList;
    }
}
