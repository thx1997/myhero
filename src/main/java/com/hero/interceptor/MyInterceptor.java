package com.hero.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class MyInterceptor implements HandlerInterceptor{
	/**
	 * 整个请求结束之后被调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 请求处理之后进行调用，但在视图渲染之前（controller方法调用之后）
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 在请求处理之前进行调用（controller方法调用之前）
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse response, Object arg2) throws Exception {
		//允许跨域
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Method", "GET,HEAD,POST,PUT,PATCH,DELETE,OPTIONS,TRACES");
		response.setHeader("Access-Control-Allow-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		return true;
	}

}
