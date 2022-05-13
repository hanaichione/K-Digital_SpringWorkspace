package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.DeptDTO;
import com.member.service.DeptService;

@Controller
public class MainController {
	
	@Autowired
	DeptService service;
	
	@RequestMapping("/list")
	public void list(Model m) {
		System.out.println("list()==========");
		List<String> list = service.list();
		System.out.println(list);
		m.addAttribute("list", list);
	}
	
	@RequestMapping("/add")
	public String add(DeptDTO dto) {
		System.out.println("add()===========");
		int n = service.add(dto);
		System.out.println(n);
		return "redirect:list";
	}
	
	@RequestMapping("/update")
	public String update(DeptDTO dto) {
		System.out.println("update()===========");
		int n = service.update(dto);
		System.out.println(n);
		return "redirect:list";
	}
	
	@RequestMapping("/del")
	public String del(int deptno) {
		System.out.println(deptno);
		int n = service.del(deptno);
		System.out.println(n);
		return "redirect:list";
		
		// String deptno로 받아서 Integer.parseInt(deptno)
	}
}
