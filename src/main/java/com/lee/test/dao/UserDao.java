package com.lee.test.dao;

import com.lee.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  use MapperScan in the App instead.
 *  so comment out the annotation Mapper
 */
//@Mapper
public interface UserDao {

    int saveUser(User user);

    List<User> getAllUser();
}
