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
	
	@RequestMapping(value="/aaa",  method = RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) {	// key값이 정확하지 않음, 비추
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/bbb", method = RequestMethod.GET)
	public String xxx2(@ModelAttribute("xxx") ArrayList<String> list) {
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		return "main2";
	}
}
