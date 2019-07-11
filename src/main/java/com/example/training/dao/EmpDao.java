package com.example.training.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.training.dto.EmpDetailInfo;
import com.example.training.dto.EmpListInfo;
import com.example.training.dto.EmpSearchInfo;
import com.example.training.mapper.EmpMstMapper;

@Component
public class EmpDao {

	@Autowired
	private EmpMstMapper empMstMapper;

	public List<EmpListInfo> findEmpList(EmpSearchInfo empSearchInfo) {

		String empId = empSearchInfo.getEmpId() == "" ? null :empSearchInfo.getEmpId();

		String lastName = empSearchInfo.getLastName() == "" ? null :empSearchInfo.getLastName();

		String firstName = empSearchInfo.getFirstName() == "" ? null :empSearchInfo.getFirstName();

		String positionCode = empSearchInfo.getPositionCode();

		List<EmpListInfo> result = empMstMapper.findEmpList(empId, lastName, firstName, positionCode);

		return result;
	}

	public EmpDetailInfo findEmpById(String empId) {

		EmpDetailInfo result = empMstMapper.findEmpById(empId);

		return result;
	}


	public Map<String, Object> findEmpMstById(String empId) {
		return null;

	}

	public Map<String, Object> findEmpSalaryById(String empId) {
		return null;

	}

}