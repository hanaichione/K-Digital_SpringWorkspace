package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
//		return "loginForm";
		return "redirect:login";	//**** login.jsp가 아닌 /login 주소로 get 방식 다시 요청
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginDTO dto, HttpSession session) {
		System.out.println("login Session 설정 = " + dto);
		session.setAttribute("login", dto);
		return "login";
	}

	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String login2(LoginDTO dto, HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println("login2 Session 설정 === " + dto);
		session.setAttribute("login", dto);
		return "login";
	}

}
