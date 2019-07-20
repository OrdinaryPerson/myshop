package com.imufe.ws.service.test;

import org.junit.Test;

import com.imufe.ws.pojo.User;
import com.imufe.ws.service.impl.UserServiceImpl;

public class UserServiceTest {
	
//	private UserService userService=new UserServiceImpl();
	
	@Test
	public void testFindByUsernameAndPassword() {
		User user = new User();
		user.setUsername("tom1");
		user.setPassword("1A88AA6D621340369479A4576EC01357");
		UserServiceImpl ab=new UserServiceImpl();
		User dbUser=ab.findByUsernameAndPassword(user); 
		if(dbUser!=null) {                                   
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
		
	}
}
