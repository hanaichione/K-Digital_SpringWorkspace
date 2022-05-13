package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@RequestMapping("/login")
	public String loginForm() {
		System.out.println("TestController.loginFrom get 요청됨=============");
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login() {
		System.out.println("TestController.login Post 요청됨 =============");
		return "login";
	}
	
}
