package com.imufe.ws.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imufe.ws.pojo.User;


public class UserServiceImplTest {

    //private UserServiceImpl userService=new UserServiceImpl();

    @Test
    public void testAddUser() {
        
        ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService= (UserServiceImpl) application.getBean("userService");
        userService.addUser();
        userService.selectUser();
    }

    @Test
    public void testSelectUser() {
       
    }

    @Test
    public void testUpdataUser() {
        
    }

    @Test
    public void testDeleteUser() {
      
    }

}
