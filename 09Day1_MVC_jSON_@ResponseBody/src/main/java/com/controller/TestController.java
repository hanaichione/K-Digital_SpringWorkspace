package com.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;

@Controller
public class TestController {

	@RequestMapping("/ddd")
	@ResponseBody
	public String ddd() {
		return "ok";	// "ok" 문자열이 응답으로 전달됨(@ResponseBody)
	}
	
	@RequestMapping("/aaa")
	public @ResponseBody Login aaa() {
		// @ResponseBody : 응답 jsp 없이 리턴 데이터를 비동기로 response로 응답(클라이언트한테 바로 보내줌)
		System.out.println("aaa()=============");
		Login login = new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}

	@RequestMapping("/bbb")
	@ResponseBody
	public ArrayList<Login> bbb() {
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		list.add(new Login("홍길동4", "40"));
		return list;
	}

	@RequestMapping("/ccc")
	@ResponseBody
	public HashMap<String, ArrayList<Login>> ccc() {
		HashMap<String, ArrayList<Login>> map = 
				new HashMap<String, ArrayList<Login>>();
		
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("유관순1", "10"));
		list2.add(new Login("유관순2", "20"));
		list2.add(new Login("유관순3", "30"));
		
		map.put("one", list);
		map.put("two", list2);
		
		return map;
	}
}
