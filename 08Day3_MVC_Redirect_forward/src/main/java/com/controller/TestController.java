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

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value="/main")
	public String main(){
		System.out.println("main==========================");
		return "main";
	}
	
	// 1. redirect 시 request.getParameter("userid") // 파라미터로 전송, setAttribute 사용 안 됨
	@RequestMapping(value="/redirect")
	public String redirect(Model m, HttpServletRequest request){
		System.out.println("redirect 호출");
//		m.addAttribute("userid", "홍길동");
		request.setAttribute("passwd", "1234");	// 전달되지 않음
//		return "redirect:main";
		return "redirect:main?userid=aaa";	// 직접 주소에 넣어도 parameter로 뽑기 가능
	}
	
	@RequestMapping(value="/forward")
	public String forward(Model m, HttpServletRequest request){
		System.out.println("redirect 호출");
		m.addAttribute("userid", "홍길동");
		request.setAttribute("passwd", "1234");
		return "forward:main";	
	}
	
}
