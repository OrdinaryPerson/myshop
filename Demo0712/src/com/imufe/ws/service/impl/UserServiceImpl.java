package com.imufe.ws.service.impl;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.imufe.ws.dao.UserDao;
import com.imufe.ws.dao.impl.UserDaoImpl;
import com.imufe.ws.pojo.User;
import com.imufe.ws.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao=new UserDaoImpl();
	
	User dbUser=null;
	public User findByUsernameAndPassword(User user) {
		// TODO Auto-generated method stub
		try {
			dbUser=userDao.selectOne(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		
			return dbUser;
	}
	
}
