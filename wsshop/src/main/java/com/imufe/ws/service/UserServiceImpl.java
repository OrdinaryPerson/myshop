package com.imufe.ws.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.imufe.ws.dao.UserDao;
import com.imufe.ws.pojo.User;


//@Service
public class UserServiceImpl implements UserService {

    private Logger logger=Logger.getLogger(UserServiceImpl.class);
    private UserDao dao;   
    private String username;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;
    private String[] members;
//    
//
//    
//    
////    public UserServiceImpl(UserDao dao) { 
////        super(); 
////        this.dao=dao; 
////    }
//     
//    
    public Set<String> getSet() {
        return set;
    }


    public void setSet(Set<String> set) {
        this.set = set;
    }


    public Map<String, String> getMap() {
        return map;
    }


    public void setMap(Map<String, String> map) {
        this.map = map;
    }


    public Properties getProperties() {
        return properties;
    }


    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    public String[] getMembers() {
        return members;
    }


    public void setMembers(String[] members) {
        this.members = members;
    }


    public List<String> getList() {
        return list;
    }

    
    public void setList(List<String> list) {
        this.list = list;
    }



    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }



    public UserDao getDao() {
        return dao;
    }


    public void setDao(UserDao dao) {
        this.dao = dao;
    }

   
    public void save(User user) {
        // TODO Auto-generated method stub
        System.out.println(username);
        System.out.println("set"+"\n"+set);
        System.out.println("map"+"\n"+map);
        System.out.println("properties"+"\n"+properties);
        System.out.println("Array"+"\n"+Arrays.toString(members));
        //dao.save(user);
        
    }
    public void addUser() {
        logger.debug("添加日志");
        System.out.println("添加用户......");
    }
    
    public void selectUser() {
        logger.debug("测试日志");
        System.out.println("查询用户......");
        System.out.println("日志，数据库已关闭");
    }
    
    public void updataUser() {
        System.out.println("日志，数据库已连接");
        System.out.println("更新用户......");
        System.out.println("日志，数据库已关闭");
    }
    
    public void deleteUser() {
        System.out.println("日志，数据库已连接");
        System.out.println("删除用户......");
        System.out.println("日志，数据库已关闭");
    }
  @Test
    public void testSave() {
        ApplicationContext  application =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService)application.getBean("userService");
        UserService userService1=(UserService)application.getBean("userService");
        System.out.println(userService==userService1);
        User user=new User();
        user.setUsername("user");
        user.setPassword("134");
        //userService.save(user);  
    }
}
