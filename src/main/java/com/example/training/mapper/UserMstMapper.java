package com.example.training.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.training.dto.UserInfo;

@Mapper
public interface UserMstMapper {

	public UserInfo findUser(@Param("userId") String userId, @Param("userPassword") String userPassword);
}