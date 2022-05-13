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
		return "redirect:main";	//**** login.jsp가 아닌 /login 주소로 get 방식 다시 요청
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "main";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String logined(LoginDTO dto, HttpSession session) {
		LoginDTO mdto = (LoginDTO) session.getAttribute("mlogin");
		String nextpage="";
		if(mdto != null) {	// 회원가입 정보가 있을 때
			System.out.println("id : " + mdto.getUserid());
			if(mdto.getUserid().equals(dto.getUserid())
					&&mdto.getPasswd().equals(dto.getPasswd())) {
				session.setAttribute("login", dto);
				nextpage="logined";
			} else {
				System.out.println("id가 없음");
				nextpage="redirect:login";
			}
		} else {	// 회원가입 정보가 없을 때
			System.out.println("회원가입 정보가 없습니다.");
			nextpage="redirect:login";
		}
		return nextpage;
	}

	@RequestMapping(value="/member", method = RequestMethod.GET)
	public String memebr() {
		System.out.println("member get============");
		return "memberForm";
	}

	@RequestMapping(value="/member", method = RequestMethod.POST)
	public String memebr(LoginDTO dto, HttpSession session) {
		System.out.println("/member Post======== " + dto);
		session.setAttribute("mlogin", dto);
		return "redirect:login";
	}

}
