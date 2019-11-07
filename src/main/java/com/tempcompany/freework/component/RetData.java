package com.tempcompany.freework.component;

import lombok.Data;

@Data
public class RetData {
    private String code="200";
    private String message="success";
    private Object body;

    public RetData success(Object body) {
        this.body=body;
        return this;
    }

    public RetData fail(String code,String message) {
        this.code=code;
        this.message=message;
        return this;
    }
}
