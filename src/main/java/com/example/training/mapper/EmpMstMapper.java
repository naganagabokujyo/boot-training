package com.example.training.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.training.dto.EmpDetailInfo;
import com.example.training.dto.EmpListInfo;

@Mapper
public interface EmpMstMapper {

	public List<EmpListInfo> findEmpList(@Param("empId") String empId,
			@Param("lastName") String lastName,
			@Param("firstName") String firstName,
			@Param("positionCode") String positionCode);

	public EmpDetailInfo findEmpById(@Param("empId") String empId);


}