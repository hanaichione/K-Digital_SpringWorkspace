package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/xxx")
	public String xxx() {
		return "/WEB-INF/views/home.jsp";
	}
	
	@RequestMapping("/xxx2")
	public String xxx2() {
		return "/WEB-INF/views/main.jsp";
	}
}
