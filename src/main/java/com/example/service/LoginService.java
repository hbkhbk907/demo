package com.example.service;

import com.example.repository.entity.UserDo;

public interface LoginService {
	UserDo findByUser(String User);
}
