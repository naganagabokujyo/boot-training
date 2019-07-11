package com.example.training.service;

import java.util.Map;

import com.example.training.dto.EmpSearchInfo;

public interface EmpListSevice {

	public EmpSearchInfo searchCheck (EmpSearchInfo empSearchInfo);

	public EmpSearchInfo findEmpList(EmpSearchInfo empSearchInfo);

	public Map<String, Object> findEmpDetail(String empId);

}