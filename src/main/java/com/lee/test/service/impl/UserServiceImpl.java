package com.lee.test.service.impl;

import com.lee.test.dao.UserDao;
import com.lee.test.entity.User;
import com.lee.test.service.UserServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiece {

    @Autowired
    UserDao dao;

    @Override
    public int saveUser(User user) {
        int result = dao.saveUser(user);
        return result;
    }

    @Override
    public List<User> findAll() {
        System.out.println("test in findAll");
        return dao.getAllUser();
    }
}
