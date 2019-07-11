package com.example.training.util;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

	private static final String ERROR_MSG = "ErrMsg";

	private static final String WARNING_MSG = "WarnMsg";

	public void createErrMsgMessage(String target, String message, Map<String, Object> errMessages) {

		// 項目名に"ErrMsg"という文字列を付与してキーとして設定、引数messageをvalueとして設定する。
		String errMsgKey =  target.concat(ERROR_MSG);
		errMessages.put(errMsgKey, message);

	}

	public void createWarnMsgMessage(String target, String message, Map<String, Object> warningMessages) {

		// 項目名に"WarnMsg"という文字列を付与してキーとして設定、引数messageをvalueとして設定する。
		String warnMsgKey =  target.concat(WARNING_MSG);
		warningMessages.put(warnMsgKey, message);

	}
}