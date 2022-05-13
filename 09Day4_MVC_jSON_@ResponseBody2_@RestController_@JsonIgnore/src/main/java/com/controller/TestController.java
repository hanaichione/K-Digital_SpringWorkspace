package com.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@Controller
public class TestController {

	@RequestMapping("/eee")
	@ResponseBody
	public String eee() {
		return "hello";
	}
	
	@RequestMapping("/ddd")
//	@ResponseBody // 대신 ResponseEntity 사용
	public ResponseEntity<Login> ddd() {
		System.out.println("ddd 호출됨");
		Login login = new Login("윤동주", "20");
		ResponseEntity<Login> entity =
				ResponseEntity.status(200).body(login);	// 200 : 정상
		return entity; // entity 객체에 상태값 body 추가, 200 정상 body에 추가
	}

	@RequestMapping("/aaa")
	@ResponseBody
	public Login aaa() {
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
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();

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
