package com.imufe.ws.dao;

import java.io.IOException;

import com.imufe.ws.pojo.User;

public interface UserDao {
    public void save(User user);
    public User findById(int id) throws IOException;
    public void insertUser(User user) throws IOException;
    public void deleteById(int id) throws IOException;
    public void updataById(User user) throws IOException;
}
