package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}
	@RequestMapping(value="/login1",  method = RequestMethod.POST)
	public String login(LoginDTO dto) {	// key값이 정확하지 않음, 비추
		//req.setAtt와 동일, key값은 자동으로 소문자 시작 클래스이름, = loginDTO 이름이 없는 상태
		return "login1";	// login1.jsp // 데이터의 자동 forward => req.get
	}
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public ModelAndView login2(LoginDTO dto) {
		System.out.println("login2.mav============"+ dto);
		ModelAndView mav= new ModelAndView();
		mav.addObject("login", dto);   //request에서 key 값이 login가 됨
		mav.setViewName("login2");   //login2.jsp
		return mav;		
	}
	
	@RequestMapping(value="/login3", method = RequestMethod.POST)
	public String login3(@ModelAttribute("xxx") LoginDTO dto) {	// dto의 키값을 xxx로 설정
		System.out.println("login3.post==============" + dto);
		// request.setAttribute("xxx", dto)
		// 이름 없는 상태
		return "login3";
	}
	
	@RequestMapping(value="/login4",  method = RequestMethod.POST)
	public String login4(LoginDTO dto, Model m) {	// key값이 정확하지 않음, 비추
		System.out.println("login4.post=============="+dto);
		m.addAttribute("login", dto);
		return "login4";
	}
}
