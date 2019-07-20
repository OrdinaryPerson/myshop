package com.imufe.ws.service;

import com.imufe.ws.pojo.User;

public interface UserService {
	User findByUsernameAndPassword(User user);
}
