package com.example.training.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.training.dao.UserDao;
import com.example.training.dto.UserInfo;
import com.example.training.service.LoginSevice;
import com.example.training.util.MessageUtil;

@Component
public class LoginSeviceImpl implements LoginSevice {

	@Autowired
	private MessageUtil messageUtil;

	@Autowired
	private UserDao userDao;

	@Override
	public UserInfo login(UserInfo userInfo) {

		// エラーメッセージの情報を初期化
		userInfo.setErrMessages(new HashMap<>());
		// ユーザー情報取得
		UserInfo result = userDao.findUser(userInfo);
		// ユーザー情報が取得できない場合、元のuserInfoにエラーを設定。
		if (result == null) {
			Map<String, Object> errMessages = new HashMap<>();
			messageUtil.createErrMsgMessage("login", "ログインできねっす", errMessages);
			userInfo.setErrMessages(errMessages);
		}

		return userInfo;
	}

}