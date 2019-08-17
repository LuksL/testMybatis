package com.lee.test;


import com.lee.test.entity.User;
import com.lee.test.service.UserServiece;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Unit test for simple App.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest {

    @Autowired
    UserServiece userServiece;

    @Test
    public void getAllUser() {
        for (User user : userServiece.findAll()) {
            System.out.println(user);
        }
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("name in add");
        user.setId(4);
        userServiece.saveUser(user);
    }
}
