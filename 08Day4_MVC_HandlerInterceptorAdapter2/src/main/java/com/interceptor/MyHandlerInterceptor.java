package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle=====");
		HttpSession session = request.getSession();
		if (session.getAttribute("login")==null) {
			// response.sendRedirect("loginForm"); 
			// 주의 모든 주소에 대한 처리가 이루어져 최초 loginForm 호출시 handler 호출의 문제가 발생 - 무한 반복
			// 특정 주소 처리에서만 동작하도록 작성할 예정
		}
		
		// request.getsession() session에 login 정보 얻기
		// login 정보가 없으면 여기서 처리(로그인폼으로 전환 등)
		return true;	// controller까지 계속 실행
//		return false;	// 진행 안 함
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle=====" + handler);
		// 원하는 controller 찾기
		HandlerMethod method = (HandlerMethod) handler;
		if (method.getBean() instanceof TestController) {	// controller가 TestController일 경우
			modelAndView.setViewName("login");	// login.jsp로 view 페이지 지정
			modelAndView.addObject("data", "홍길동");
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion=====");
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("afterConcurrentHandlingStarted=====");		
	}
	
}
