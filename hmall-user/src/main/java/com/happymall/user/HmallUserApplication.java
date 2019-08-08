package com.happymall.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.happymall.user.mapper")
public class HmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmallUserApplication.class, args);
    }

}
