package com.lee.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * if put '@MapperScan' here, then no need to set in the dao class
 *
 */
@SpringBootApplication
@MapperScan("com.lee.test.dao")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        System.out.println( "Hello World!" );
    }
}
