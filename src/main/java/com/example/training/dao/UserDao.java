package com.example.training.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.training.dto.UserInfo;
import com.example.training.mapper.UserMstMapper;

@Component
public class UserDao {

	@Autowired
	private UserMstMapper userMstMapper;

	public UserInfo findUser(UserInfo userInfo) {
	    String userId = userInfo.getUserId();
	    String userPassword = userInfo.getUserPassword();
	    return userMstMapper.findUser(userId, userPassword);
	}





}