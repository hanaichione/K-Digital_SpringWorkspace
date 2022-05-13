package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value="/aaa")
	public String xxx() {
		if(true) throw new ArithmeticException("ArithmeticException 발생 ============= ");
		return "main";
	}

	@RequestMapping(value="/bbb")
	public String bbb() {
		if(true) throw new NullPointerException("NullPointerException 발생 ============= ");
		return "main";
	}
	
//	@ExceptionHandler({ArithmeticException.class, NullPointerException.class})
//	@ExceptionHandler({Exception.class})
//	public String errorPage() {
//		return "error";	// 에러 처리 페이지로 이동 => error.jsp, Exception 객체가 전달됨
//	}
}
