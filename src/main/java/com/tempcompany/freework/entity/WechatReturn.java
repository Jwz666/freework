package com.tempcompany.freework.entity;

import lombok.Data;

@Data
public class WechatReturn {

    private String openid;

    private String session_key;

    private String unionid;
}
