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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {

	// interceptor를 거쳐 session 정보 있으면 main.jsp
	// 없으면 loginForm.jsp
	@RequestMapping(value="/main")
	public String main(){
		System.out.println("main==========================");
		return "main";
	}
	
	@RequestMapping(value="/loginForm")
	public String loginForm(){
		System.out.println("TestController.loginForm호출됨==========================");
		return "loginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(String userid, String passwd, HttpSession session) {
		System.out.println("TestController.login호출됨");
		session.setAttribute("login", userid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("userid", userid);
		mav.addObject("passwd", passwd);
		mav.setViewName("logined");
		return mav;
	}
}
