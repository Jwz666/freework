package com.tempcompany.freework.service;

import com.tempcompany.freework.component.RetData;
import com.tempcompany.freework.entity.WechatReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class WechatService{

    @Value("${wechat.appid}")
    private String appId;

    @Value("${wechat.appsecret")
    private String appSecret;

    private final String wechatUserUrl="https://api.weixin.qq.com/sns/jscode2session";

    private RestTemplate restTemplate=new RestTemplate();

    public WechatReturn getWechatUserInfo(String code) {
        Map<String,String> param=new HashMap<>();
        param.put("appid",appId);
        param.put("secret",appSecret);
        param.put("code",code);
        param.put("js_code",code);
        param.put("grant_type","authorization_code");
       WechatReturn wechatReturn = restTemplate.getForObject(wechatUserUrl, WechatReturn.class,param);
        return wechatReturn;
    }

}
