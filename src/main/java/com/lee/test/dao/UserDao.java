package com.lee.test.dao;

import com.lee.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    int saveUser(User user);

    List<User> getAllUser();
}
