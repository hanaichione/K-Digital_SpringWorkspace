package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping("/main")
	public String xx() {
		System.out.println("main()==================");
		return "main";
	}	
	

	//ModelAndView  : view페이지 정보, view 전달 데이터  추가 
	// 컨테이너에게 ModelAndView를 리턴 
	@RequestMapping("/aaa")
	public ModelAndView xxx2() {
		System.out.println("/aaa======================");
		ModelAndView mav= new ModelAndView();////직접 객체 생성 후 저장, 리턴 
		mav.addObject("username", "홍길동");//request.setATT 와 동일 =>request.getAtt 
		mav.addObject("age", 20);
		LoginDTO dto= new LoginDTO("test");
		mav.addObject("login", dto );  //Object 저장 
		mav.setViewName("main2");//view 페이지 :  WEB-INF/views/main2.jsp
		return mav;		 //ModelAndView 리턴 
	}
}
