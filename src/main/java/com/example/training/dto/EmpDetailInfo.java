package com.example.training.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;


public class EmpDetailInfo extends StatusInfo {

	private String empId;

	private String lastName;

	private String firstName;

	private Integer age;

	private Integer period;

	private String positionCode;

	private BigDecimal basicSalary;

	private BigDecimal positionSalary;

	private Timestamp empMstUpdateDate;

	private Timestamp empSalaryUpdateDate;

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
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName セットする lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName セットする firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return period
	 */
	public Integer getPeriod() {
		return period;
	}

	/**
	 * @param period セットする period
	 */
	public void setPeriod(Integer period) {
		this.period = period;
	}

	/**
	 * @return positionCode
	 */
	public String getPositionCode() {
		return positionCode;
	}

	/**
	 * @param positionCode セットする positionCode
	 */
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	/**
	 * @return basicSalary
	 */
	public BigDecimal getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary セットする basicSalary
	 */
	public void setBasicSalary(BigDecimal basicSalary) {
		this.basicSalary = basicSalary;
	}

	/**
	 * @return positionSalary
	 */
	public BigDecimal getPositionSalary() {
		return positionSalary;
	}

	/**
	 * @param positionSalary セットする positionSalary
	 */
	public void setPositionSalary(BigDecimal positionSalary) {
		this.positionSalary = positionSalary;
	}

	/**
	 * @return empMstUpdateDate
	 */
	public Timestamp getEmpMstUpdateDate() {
		return empMstUpdateDate;
	}

	/**
	 * @param empMstUpdateDate セットする empMstUpdateDate
	 */
	public void setEmpMstUpdateDate(Timestamp empMstUpdateDate) {
		this.empMstUpdateDate = empMstUpdateDate;
	}

	/**
	 * @return empSalaryUpdateDate
	 */
	public Timestamp getEmpSalaryUpdateDate() {
		return empSalaryUpdateDate;
	}

	/**
	 * @param empSalaryUpdateDate セットする empSalaryUpdateDate
	 */
	public void setEmpSalaryUpdateDate(Timestamp empSalaryUpdateDate) {
		this.empSalaryUpdateDate = empSalaryUpdateDate;
	}


}