package com.example.springmybatistest5.controlle;

import com.example.springmybatistest5.bean.User;
import com.example.springmybatistest5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.SchemaOutputResolver;

@Controller
public class UserControlle {
    @Autowired
    UserService userService;


    //@RequestMapping("/get/{id}")
    @ResponseBody
    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") Integer id){
        System.out.println("进入controlle+++++++++++++++++++");


        return userService.getUserById(id);
    }
}
