package com.example.springmybatistest5.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.example.springmybatistest5.bean.User;
@Repository
public interface UserMapper {
    @Select("select * from users where id=#{id}")
    User getUserById(@Param("id") Integer id);

}
