package com.example.repository.mapper;


import com.example.repository.entity.UserDo;

public interface UserDoMapper {
    int deleteByPrimaryKey(String user);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByPrimaryKey(String user);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}