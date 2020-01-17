package com.shenlanbao.consult;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UtilsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        List<DemoData> orders = ExcelUtils.readExcelForOrder("C:\\Users\\slb\\Desktop\\java_utils\\order.xlsx");
        System.out.println(orders);
    }

}
