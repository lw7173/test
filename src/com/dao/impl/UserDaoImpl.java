package com.dao.impl;

import com.dao.IUserDao;

public class UserDaoImpl implements IUserDao{

	@Override
	public void login(String username, String password) {
		System.out.println("持久层登录");
	}

}
