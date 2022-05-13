package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.DeptDTO;
import com.member.service.MemberService;

@Controller
public class MainController {
	@Autowired
	MemberService service;
	
	@RequestMapping("/list")
	public void list(Model m) {
		System.out.println("list()============");
		List<DeptDTO> list = service.list();
		System.out.println(list);
		m.addAttribute("list", list);
	}
}
