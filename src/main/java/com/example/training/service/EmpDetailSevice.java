package com.example.training.service;

import java.util.Map;

import com.example.training.dto.EmpSearchInfo;

public interface EmpDetailSevice {

	public EmpSearchInfo edit (EmpSearchInfo empSearchInfo);

	public EmpSearchInfo findEmpList(EmpSearchInfo empSearchInfo);

	public Map<String, Object> findEmpDetail(String empId);

}