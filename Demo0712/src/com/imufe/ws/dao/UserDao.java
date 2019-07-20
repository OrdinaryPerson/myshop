package com.imufe.ws.dao;

import com.imufe.ws.pojo.User;


public interface UserDao {
	java.util.List<User> selectALL();
	User selectByUsernameAndPassowrd(User user);
	User selectOne(User user) throws Exception;
	int insert(User user);
	int deleteByPrimaryId(Integer id);
	int updataByPrimaryId(Integer id);
}
