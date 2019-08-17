package com.lee.test.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

    //    @Pointcut("execution(* com.lee.test.controller.UserController.getAllUser(..))")
    @Pointcut("execution(* com.lee.test.service.UserServiece.findAll(..))")
    public void pointcut() {
        //  System.out.println("in pointcut");
    }

    //    @Before("execution(* com.lee.test.controller.UserController.*(..))")
    @Before("pointcut()")
    public void beforeTest() {
        System.out.println("this is before message");
    }

    @After("pointcut()")
    public void AfterTest() {
        System.out.println("this is after message");
    }
}
