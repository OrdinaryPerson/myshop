package com.imufe.ws.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;import org.aspectj.weaver.NewConstructorTypeMunger;
import org.junit.Test;

import com.imufe.ws.pojo.User;

public class UserDaoImpl implements UserDao {
    
    
    @Override
    public void save(User user) {
        // TODO Auto-generated method stub
        System.out.println(user.getUsername()+user.getPassword());
    }

    @Override
    public User findById(int id) throws IOException {
        // TODO Auto-generated method stub
        InputStream ri=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(ri);
        SqlSession session=sessionFactory.openSession();
        User user=(User)session.selectOne("findById", id);
        return user;
    }
    
    public void testFindById() throws IOException {
        System.out.println(findById(1).getUsername());
    }

    @Override
    public void insertUser(User user) throws IOException {
        // TODO Auto-generated method stub
        InputStream ri=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(ri);
        SqlSession session=sessionFactory.openSession();
        session.insert("insertUser", user);   
        session.commit();
        System.out.println("插入函数已执行");
    }
    
    @Override
    public void deleteById(int id) throws IOException {
        // TODO Auto-generated method stub
        InputStream ri=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(ri);
        SqlSession session=sessionFactory.openSession();
        session.delete("deleteById", id);
        session.commit();
        System.out.println("删除函数已执行");        
    }

    @Override
    public void updataById(User user) throws IOException {
        InputStream ri=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory =new SqlSessionFactoryBuilder().build(ri);
        SqlSession session=sessionFactory.openSession();
        session.update("updataById", user);
        session.commit();
        System.out.println("更新函数已执行"); 
    }
    
    @Test
    public void test() throws IOException {
        //System.out.println(findById(1).getUsername());
//        User user=new User();
//        user.setUsername("哈哈");
//        user.setPassword("000");
//        user.setRole(0);
//        user.setCreate_time(new Date());
//        user.setUpdate_time(new Date());
//        System.out.println(new Date() );
//        insertUser(user);
        
//        deleteById(21);
          User user=new User();
          user.setId(28);
          user.setUsername("没更新");
          user.setPassword("123");
          user.setUpdate_time(new Date());
          updataById(user);
    }

    

}
