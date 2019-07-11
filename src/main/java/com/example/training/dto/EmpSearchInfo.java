package com.example.training.dto;

import java.util.ArrayList;
import java.util.List;


public class EmpSearchInfo extends StatusInfo {

	private String empId;

	private String lastName;

	private String firstName;

	private String positionCode;

	private List<EmpListInfo> empListInfo = new ArrayList<>();

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
	 * @return empListInfo
	 */
	public List<EmpListInfo> getEmpListInfo() {
		return empListInfo;
	}

	/**
	 * @param empListInfo セットする empListInfo
	 */
	public void setEmpListInfo(List<EmpListInfo> empListInfo) {
		this.empListInfo = empListInfo;
	}


}