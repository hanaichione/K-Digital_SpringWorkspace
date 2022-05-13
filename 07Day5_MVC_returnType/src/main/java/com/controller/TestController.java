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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

	@RequestMapping(value="/aaa", method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa() 함수 실행 ======= ");
		return "main";
	}

	// 매핑 주소의 return 페이지가 응답 페이지가 됨
	@RequestMapping(value="/hhh", method = RequestMethod.GET)
	public String hhh(HttpServletRequest request) {
		System.out.println("/hhh =============");
		request.setAttribute("test", "홍길동");
		return "redirect:aaa";	// redirect 시 request.setAtt 전달 안 됨 (반드시 주의)
		// 주소가 aaa로 바뀌기 때문에 전달이 안 됨
	}
	
	@RequestMapping(value = "/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("bbb================");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동");
		mav.setViewName("main2");
		return mav;
	}
	
	// 리턴타입 DTO => 모델만 명시, view는 ccc.jsp를 유추, url잉 뷰페이지의 이름이 됨
	// 1) 뷰페이지는 url.jsp
	// 2) 리턴 dto는 키가 없으므로 loginDTO가 키 값
	@RequestMapping(value="/ccc", method=RequestMethod.GET)
	public LoginDTO xxx() {
		System.out.println("ccc============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}
	
	@RequestMapping(value="/ddd", method=RequestMethod.GET)
	@ModelAttribute("xxx")	// key값 xxx
	public LoginDTO xxx2() {
		System.out.println("ddd============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("홍길동");
		dto.setPasswd("1234");
		return dto;
	}

	@RequestMapping(value="/eee", method=RequestMethod.GET)
	@ModelAttribute("yyy")	// key값 xxx
	public ArrayList<String> eee() {
		System.out.println("eee============");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		return list;
	}
	
	@RequestMapping(value="/fff", method=RequestMethod.GET)
	public void fff(HttpServletRequest request) {
		request.setAttribute("username", "홍길동");
		System.out.println("fff");
	}

	@RequestMapping(value="/ggg", method=RequestMethod.GET)
	public void ggg(Model m) {
		m.addAttribute("username", "홍길동");
		System.out.println("ggg");
	}
}
