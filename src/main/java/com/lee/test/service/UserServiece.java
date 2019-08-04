package com.lee.test.service;

import com.lee.test.entity.User;

import java.util.List;

public interface UserServiece {

    int saveUser(User user);
    List<User> findAll();
}
