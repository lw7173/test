package com.service.impl;

import com.dao.IUserDao;
import com.service.IUserService;

public class UserServiceImpl implements IUserService{

	IUserDao userDao;
	
	@Override
	public void login(String username, String password) {
		userDao.login(username, password);
	}

}
