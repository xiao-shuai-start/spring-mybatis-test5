package com.example.springmybatistest5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springmybatistest5.dao")
public class SpringMybatisTest5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisTest5Application.class, args);
    }

}
