package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/kkk")
	public String xxx() {
		System.out.println("xxx method 호출됨=================");
		return "hello";
	}
}
