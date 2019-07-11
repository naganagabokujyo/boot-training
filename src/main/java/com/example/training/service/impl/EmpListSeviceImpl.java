package com.example.training.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.training.constant.NumEnum;
import com.example.training.dao.EmpDao;
import com.example.training.dto.EmpDetailInfo;
import com.example.training.dto.EmpListInfo;
import com.example.training.dto.EmpSearchInfo;
import com.example.training.service.EmpListSevice;
import com.example.training.util.CheckUtil;
import com.example.training.util.MessageUtil;

@Component
public class EmpListSeviceImpl implements EmpListSevice {

	@Autowired
	private CheckUtil checkUtil;

	@Autowired
	private MessageUtil messageUtil;

	@Autowired
	private EmpDao empDao;

	@Override
	public EmpSearchInfo searchCheck (EmpSearchInfo empSearchInfo) {

		// エラーメッセージマップを作成
		Map<String, Object> errMessages = new HashMap<>();

		String empId =  empSearchInfo.getEmpId();
		String lastName =  empSearchInfo.getLastName();
		String firstName =  empSearchInfo.getFirstName();

		// 社員idチェック
		if (checkUtil.maxLenghCheck(empId, NumEnum.EIGHT.getValue())) {
			messageUtil.createErrMsgMessage("empId", "社員IDの桁数多い", errMessages);
		}

		// 苗字チェック
		if (checkUtil.maxLenghCheck(lastName, NumEnum.SIX.getValue())) {
			messageUtil.createErrMsgMessage("lastName", "苗字の桁数多い", errMessages);
		}

		// 名前チェック
		if (checkUtil.maxLenghCheck(firstName, NumEnum.SIX.getValue())) {
			messageUtil.createErrMsgMessage("firstName", "名前の桁数多い", errMessages);
		}

		empSearchInfo.setErrMessages(errMessages);

		return empSearchInfo;

	}

	@Override
	public EmpSearchInfo findEmpList(EmpSearchInfo empSearchInfo) {

		List<EmpListInfo> result = empDao.findEmpList(empSearchInfo);

		// 取得結果が空の場合メッセージを設定
		if (result.isEmpty()) {
			// ワーニングメッセージマップを作成
			Map<String, Object> warningMessages = new HashMap<>();
			messageUtil.createWarnMsgMessage("noRecord", "桁数多い", warningMessages);
			empSearchInfo.setWarningMessages(warningMessages);
		}
		empSearchInfo.setEmpListInfo(result);

		return empSearchInfo;

	}

	@Override
	public Map<String, Object> findEmpDetail(String empId) {

		Map<String, Object> resultMap = new HashMap<>();

		EmpDetailInfo result = empDao.findEmpById(empId);

		if (result == null) {
			Map<String, Object> errMessages = new HashMap<>();
			messageUtil.createErrMsgMessage("noData", "データ消されてますーー", errMessages);
			resultMap.put("errMessages", errMessages);
		}
		resultMap.put("result", result);
		return resultMap;
	}

}