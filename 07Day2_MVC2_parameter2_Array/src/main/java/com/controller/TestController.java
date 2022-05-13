package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginForm() {
		System.out.println("/login get");
		return "loginForm";
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login1(LoginDTO dto) {
		System.out.println("/login post, " + dto);
		return "login";
	}

	@RequestMapping(value="/login2", method = RequestMethod.POST)
	public String login2(@RequestParam String[]	phone, @RequestParam String[] chk) {
		System.out.println(phone.length);
		System.out.println(chk.length);
		return "loginForm";
	}
	@RequestMapping(value="/login3", method = RequestMethod.POST)
	public String login3(HttpServletRequest req) {
		System.out.println(req.getParameter("userid"));
		System.out.println(req.getParameter("passwd"));
		System.out.println(req.getParameterValues("phone").length);
		System.out.println(req.getParameterValues("chk").length);
		return "loginForm";
	}
	
	@RequestMapping(value="/login4", method = RequestMethod.POST)
	public String login4(String[]	phone, String[] chk) {
		System.out.println(phone.length);
		System.out.println(chk.length);
		return "loginForm";
	}
	
	
}
