package com.example.training.dto;

import java.math.BigDecimal;


public class EmpListInfo extends StatusInfo {

	private String empId;

	private String name;

	private BigDecimal salary;

	private String positionName;

	/**
	 * @return empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId セットする empId
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return salary
	 */
	public BigDecimal getSalary() {
		return salary;
	}

	/**
	 * @param salary セットする salary
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	/**
	 * @return positionName
	 */
	public String getPositionName() {
		return positionName;
	}

	/**
	 * @param positionName セットする positionName
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}


}