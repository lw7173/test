package com.controller;

import com.service.IUserService;

public class UserController {

	IUserService userService;
	
	public void login(String username,String password) {
		userService.login(username, password);
	}
	
}
