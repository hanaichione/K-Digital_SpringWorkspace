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
		if (dto != null && dto.getPasswd().equals(map.get("passwd"))) {
			session.setAttribute("login", dto);
			model.addAttribute("success", "로그인 성공");
			nextPage = "redirect:/goodsList";
		} else {
			model.addAttribute("mesg", "아이디 혹은 비밀번호가 일치하지 않습니다.");
			nextPage = "loginForm";
		}
		return nextPage;
	}
	
	@RequestMapping("/loginCheck/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../";	// .xml에 설정 main.jsp ../을 이용하여 /loginCheck의 상위 주소로 이동, / 주소 요청
		// 회원 전용 페이지는 servlet-context.xml에 주소 등록 후 이용
		
//		return "../views/main";	// 안 됨
//		return "../"; 			// loginCheck의 상위 주소로 이동 안됨, loginCheck/logout/loginForm : 오류
//		return "main";	
		// 로그아웃을 한 뒤 주소가 http://localhost:8089/shopMiniMallProject/loginCheck/loginForm 처럼 돼서 오류 발생
	}
}
