package com.example.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.training.constant.ViewNameEnum;
import com.example.training.dto.EmpDetailInfo;


@Controller
@RequestMapping(value = "/empDetail")
public class EmpDetailController  {


	/**
	 * 詳細画面初期表示
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/init")
	public String detailInit(@ModelAttribute("empDetailInfo")EmpDetailInfo empDetailInfo, Model model) {

		model.addAttribute(empDetailInfo);

		return ViewNameEnum.DETAIL.getValue();
	}

	/**
	 * 詳細画面編集処理
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/init2")
	public String edit(@ModelAttribute("empDetailInfo")EmpDetailInfo empDetailInfo, Model model) {

		model.addAttribute(empDetailInfo);

		return ViewNameEnum.DETAIL.getValue();
	}


}