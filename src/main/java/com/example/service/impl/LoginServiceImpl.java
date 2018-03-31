package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.UserDao;
import com.example.repository.entity.UserDo;
import com.example.service.LoginService;

@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserDao userDao;

	@Override
	public UserDo findByUser(String user) {
		return userDao.findByUser(user);
	}

}
