package com.tempcompany.freework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tempcompany.freework.mapper")
public class FreeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeworkApplication.class, args);
    }

}
