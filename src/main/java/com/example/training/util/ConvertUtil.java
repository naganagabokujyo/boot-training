package com.example.training.util;

import org.springframework.stereotype.Component;

@Component
public class ConvertUtil {

	/**
	 * 自動型変換メソッド
	 * @param <T>
	 * @param value
	 * @return 変換された値
	 */

	public <T> Object autoCast(T value) {
		return value;

	}

}