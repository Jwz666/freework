package com.tempcompany.freework.component;

import lombok.Data;

@Data
public class RetData {
    private String code="200";
    private String message="success";
    private Object body;
}
