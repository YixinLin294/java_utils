package com.shenlanbao.consult.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.shenlanbao.consult.common.converter.LocalDateConverter;
import com.shenlanbao.consult.common.converter.LocalDateTimeConverter;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FamilyMemberDB {
    @ExcelProperty(value = "id")
    private Integer id;
    @ExcelProperty(value = "created_at")
    private String createdAt;
    @ExcelProperty(value = "updated_at")
    private String updatedAt;
    @ExcelProperty(value = "relationship")
    private String relationship;
    @ExcelProperty(value = "name")
    private String name;
    @ExcelProperty(value = "date_of_birth", converter = LocalDateConverter.class)
    private LocalDate dateOfBirth;
    @ExcelProperty(value = "annual_income")
    private Integer annualIncome;
    @ExcelProperty(value = "phone")
    private String phone;
    @ExcelProperty(value = "purchased")
    private String purchased;
    @ExcelProperty(value = "occupation")
    private String occupation;
    @ExcelProperty(value = "social_security")
    private Boolean socialSecurity;
    @ExcelProperty(value = "commercial_insurance")
    private Boolean commercialInsurance;
    @ExcelProperty(value = "customer_id")
    private Integer customerId;
    @ExcelProperty(value = "insured")
    private Boolean insured;
    @ExcelProperty(value = "description")
    private String description;
    @ExcelProperty(value = "initial_budget_rank")
    private String initialBudgetRank;

}
