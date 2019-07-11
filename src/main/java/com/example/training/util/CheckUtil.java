package com.example.training.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class CheckUtil {

	/**
	 * 最大桁数チェック
	 * @param target
	 * @return 判定結果
	 */

	public boolean maxLenghCheck(String target, int max) {

		// nullもしくは空文字の場合はfalseを返却
		if (StringUtils.isEmpty(target)) {
			return false;
		}

		// 最大桁数を超えていた場合は、trueを返却する。
		return target.length() > max;

	}

}