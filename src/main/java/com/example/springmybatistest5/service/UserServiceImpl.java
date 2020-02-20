package com.example.springmybatistest5.service;

import com.example.springmybatistest5.bean.User;
import com.example.springmybatistest5.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {

        return userMapper.getUserById(id);
    }
}
