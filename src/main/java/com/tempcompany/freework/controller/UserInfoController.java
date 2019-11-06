package com.tempcompany.freework.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}

