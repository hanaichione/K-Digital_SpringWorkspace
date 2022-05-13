package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// interceptor를 통해 session 로그인 정보 있으면 main.jsp
	// 없는 경우 loginForm.jsp
	@RequestMapping(value="/home")
	public String main() {	// 인터셉터 처리
		System.out.println("HomeController.main 호출");
		return "main";
	}
}
