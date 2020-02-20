package com.example.springmybatistest5.controlle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControlle {
    @ResponseBody
    @RequestMapping("/demo")
    public String say(){
        System.out.println("测试++++++++++++++++");
        System.out.println();
        return  "测试";
    }

}
