package com.tempcompany.freework.controller;


import com.tempcompany.freework.component.RetData;
import com.tempcompany.freework.entity.UserInfo;
import com.tempcompany.freework.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jwz
 * @since 2019-11-04
 */
@RestController
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/login")
    public RetData login(@RequestBody UserInfo userInfo) {
       return userInfoService.login(userInfo.getCode());
    }

    @PostMapping("/improveUserInfo")
    public RetData improveUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.ImproveUserInfo(userInfo);
    }
}

