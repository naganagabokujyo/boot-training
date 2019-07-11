package com.example.training.dto;

import java.util.HashMap;
import java.util.Map;

public class StatusInfo  {

	private Map<String,Object> errMessages = new HashMap<>();

	private Map<String,Object> warningMessages = new HashMap<>();

	/**
	 * @return errMessages
	 */
	public Map<String, Object> getErrMessages() {
		return errMessages;
	}

	/**
	 * @param errMessages セットする errMessages
	 */
	public void setErrMessages(Map<String, Object> errMessages) {
		this.errMessages = errMessages;
	}

	/**
	 * @return warningMessages
	 */
	public Map<String, Object> getWarningMessages() {
		return warningMessages;
	}

	/**
	 * @param warningMessages セットする warningMessages
	 */
	public void setWarningMessages(Map<String, Object> warningMessages) {
		this.warningMessages = warningMessages;
	}





}