package com.controller;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	@ModelAttribute("xxx")
	public ArrayList<String> getList(){
		System.out.println("getList()===================");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동1");
		list.add("홍길동1");
		list.add("홍길동1");
		return list;
	}
	
	@RequestMapping(value="/aaa")
	public String aaa(@ModelAttribute("xxx") ArrayList<String> list) {
		System.out.println("aaa 추가 요청 작업");
		list.add("aaaa");
		return "main2";
	}
	
	@RequestMapping(value="/bbb")
	public String bbb(@ModelAttribute("xxx") ArrayList<String> list) {
		System.out.println("bbb 추가 요청 작업");
		list.add("bbbb");
		return "main2";
	}
}
