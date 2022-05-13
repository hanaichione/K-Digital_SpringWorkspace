package com.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@RequestMapping("/header")
	public String login3(HttpServletRequest request) {
		Enumeration<String> keys = request.getHeaderNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = request.getHeader(key);
			System.out.println(key+"\t"+value);
		}
		HttpSession session = request.getSession();
		System.out.println(session);
		return "hello";
	}
	
	
	
	
	
	
}
