package com.example.training.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * インターセプタークラス(HandlerInterceptorインターフェースをimplementsしたクラス)
 * ※HandlerInterceptorをオーバーライドしたクラスを用意すると、コントローラーのメソッドが呼び出される前や、
 * 呼びだされて一連の処理が終わった後にメソッドが呼び出せるようになる。
 */
@Component
public class SampleIntercepter implements HandlerInterceptor {
	/**
	 * preHandleメソッド(コントローラーのメソッドが呼び出される前に呼び出される前に呼び出されるメソッド)
	 * ※ ここに認証周りの処理等を記述すると、各コントローラーで認証系の処理を呼び出したりする必要がなくなる。
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {


		//AnnotationUtils.
		return true;
	}

}