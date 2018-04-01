package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.entity.UserDo;
import com.example.repository.mapper.UserDoMapper;
import com.example.service.LoginService;

@Service("LoginService")
public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserDoMapper userDao;

	@Override
	public UserDo findByUser(String user) {
		return userDao.selectByPrimaryKey(user);
	}

}
