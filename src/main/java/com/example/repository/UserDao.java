package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.repository.entity.UserDo;

public interface UserDao extends JpaRepository<UserDo, Long>{
	UserDo findByUser(String user);
}
