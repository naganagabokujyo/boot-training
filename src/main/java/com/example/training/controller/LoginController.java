package com.example.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.training.constant.ViewNameEnum;
import com.example.training.dto.UserInfo;
import com.example.training.service.LoginSevice;

/**
 * 初期画面用コントローラー
 */
@Controller
public class LoginController  {

	@Autowired
	LoginSevice loginSeviceImpl;

	/**
	 * ログイン画面初期表示
	 * @return 初期表示画面のhtml
	 */
	@RequestMapping(value = "/")
	public String init(Model model) {
		// "initView"という文字列をreturnする。
		// ※コントローラー(@Controllerが付与されたクラス)のメソッドで、かつ戻り値がStringの場合、
		// 文字列をreturnするとSpringFWの内部的な機能で、
		// src/main/resources配下にあるhtmlファイルを検索して取得し、画面に返す。

		model.addAttribute("userInfo", new UserInfo());
		return ViewNameEnum.LOGIN.getValue();
	}

	/**
	 * ログイン
	 * @return 初期表示画面のhtml
	 */
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String login(@ModelAttribute UserInfo userInfo, Model model){

		userInfo = loginSeviceImpl.login(userInfo);
		// エラーメッセージが設定されている場合、ログイン画面にエラーメッセージを表示する
		if (!userInfo.getErrMessages().isEmpty()) {
			model.addAttribute("userInfo", userInfo);
			return ViewNameEnum.LOGIN.getValue();
		}

		return "redirect:empList/init";
	}

}