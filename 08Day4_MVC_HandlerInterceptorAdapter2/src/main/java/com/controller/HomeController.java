package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/home")
	public String main() {
		System.out.println("HomeController.main 호출");
		return "main";
	}
}
