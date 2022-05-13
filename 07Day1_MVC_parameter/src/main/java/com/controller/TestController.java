package com.controller;

import java.util.Map;

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
	public String login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) {
		System.out.println("@RequestParam(\"userid\") " + id + ", @RequestParam(\"passwd\") " + pw);
		return "login";
	}

	@RequestMapping(value="/login3")
	public String login3(@RequestParam String userid, @RequestParam String passwd) {
		System.out.println("@RequestParam String userid " + userid + "\t" + "@RequestParam String passwd " + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login4")
	public String login4(String userid, String passwd) {
		System.out.println("/login4 String userid, String passwd " + userid + "\t" + passwd);
		return "login";
	}

	@RequestMapping(value="/login5")
	public String login5(@RequestParam(required = false, defaultValue = "홍길동")
	String userid, String passwd) {
		System.out.println("/login5 @RequestParam(required = false, defaultValue = \"홍길동\") " + userid + "\t" + passwd);
		return "login";
	}
	
	@RequestMapping(value="/login6")
	public String login6(@RequestParam Map<String, String> m) {
		System.out.println("/login6 RequestParam Map<String, String> m " + m);
		return "login";
	}
}
