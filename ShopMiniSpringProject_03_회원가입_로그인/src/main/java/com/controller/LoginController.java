package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	MemberService service;
	
	@RequestMapping("/login")
	public String login(@RequestParam Map<String, String> map, Model model, HttpSession session) {
		System.out.println(map);
		MemberDTO dto = service.login(map);
		System.out.println(dto);	// 해당 로그인 정보 db 존재 여부 확인 후 출력
		String nextPage = "";
		if (dto != null) {
			session.setAttribute("login", dto);
			model.addAttribute("success", "로그인 성공");
			nextPage = "main";
		} else {
			model.addAttribute("mesg", "아이디 혹은 비밀번호가 일치하지 않습니다.");
			nextPage = "loginForm";
		}
		return nextPage;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "main";
	}
}
