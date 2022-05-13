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

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value="/main")
	public String main(){
		System.out.println("main==========================");
		return "main";
	}
	
	// 1. redirect-flash<mvc:annotation-driven/> 필요
	@RequestMapping(value="/flash")
	public String redirectFlash(RedirectAttributes m){
		System.out.println("redirectFlash 호출");
		m.addFlashAttribute("userid", "홍길동");	// RedirectAttributes 사용
		// request.setAttribtue와 동일, 객체 전달이 가능
		// getatt 사용 가능, getparam 불가
		return "redirect:main";	// request가 redirect 전달
	}
	
}
