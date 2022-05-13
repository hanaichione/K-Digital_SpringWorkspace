package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/memberAdd")
	public String memberAdd(MemberDTO m, Model model) {
		System.out.println(m);
		service.memberAdd(m);
		model.addAttribute("success", "회원가입성공");
		return "main";
	}
	
	@RequestMapping(value="/loginCheck/mypage")
	public String myPage(HttpSession session) {
		System.out.println("mypage");
		
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		
		MemberDTO dto2 = service.myPage(userid);	// 수정된 회원 정보가 있을 수 있으므로 db에서 받아옴
		System.out.println(dto2);
		
		session.setAttribute("login", dto2); 		// 로그인 정보 갱신
		return "redirect:../mypage";
	}
	
//	@RequestMapping("/mypage")
//	public String aaa() {
//		return "mypage";		// redirect:../myPage 에서 여기로 찾아와서 mypage 열어줌
//	}
}
