package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/kkk")
	public String tt() {
		System.out.println("tt()함수 호출됨=================");
		return "/WEB-INF/views/home.jsp";
	}
}
