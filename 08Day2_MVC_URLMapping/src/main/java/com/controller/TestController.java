package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value="/")
	public String all() {
		return "main";
	}
	
	@RequestMapping(value="/aaa")
	public String aaa() {
		return "main";
	}
	
	// 여러개의 주소를 받을 수 있음
	@RequestMapping(value= {"/aaa2", "/aaa3"})
	public String aaa2() {
		System.out.println("aaa2 호출");
		return "main";
	}
	
	// bbb로 시작하는 단어만 가능
	@RequestMapping(value="/bbb*")	// "bbb/" 불가
	public String aaa3() {
		System.out.println("aaa3 호출 ====== ");
		return "main";
	}
	
	// *는 하나의 문자열 ccc/zzz, ccc/bbb || ccc/bbb/zzz 불가
	@RequestMapping(value="/ccc/*")
	public String aaa4() {
		System.out.println("aaa4 호출 ===== ");
		return "main";
	}
	
	// **는 여러 경로 가능 ddd/zzz, ddd/zzz/aaa, ddd/zzz/aaa/bbb
	@RequestMapping(value="/ddd/**")
	public String aaa5() {
		System.out.println("aaa5 호출 ===== ");
		return "main";
	}
	
	@RequestMapping(value="/eee/**/aaa")
	public String aaa6() {
		System.out.println("aaa6 호출 ===== ");
		return "main";
	}
	
	// /hhh/abcd/xxx/1234 
	@RequestMapping(value="/hhh/{userid}/xxx/{passwd}")
	public String aaa7(@PathVariable("userid") String userid, 
			@PathVariable("passwd") String passwd) {
		System.out.println("aaa7 호출 ===== ");
		System.out.println(userid + "\t" + passwd);
		return "main";
	}
}
