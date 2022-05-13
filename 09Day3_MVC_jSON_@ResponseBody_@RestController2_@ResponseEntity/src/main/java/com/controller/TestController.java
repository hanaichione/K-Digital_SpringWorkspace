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
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@RestController // 모든 주소 처리 응답이 @ResponseBody로 처리됨, 비동기 응답 처리 코드들만 모아놓고 작성하면 좋음
//@ResponseBody : 응답 jsp 없이 리턴 데이터를 비동기로 response로 응답(클라이언트한테 바로 보내줌)
public class TestController {

	@RequestMapping("/ddd")

	public String ddd() {
		return "ok"; // "ok" 문자열이 응답으로 전달됨(@ResponseBody)
	}

	@RequestMapping("/aaa")
	public Login aaa() {

		System.out.println("aaa()=============");
		Login login = new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}

	@RequestMapping("/bbb")

	public ArrayList<Login> bbb() {
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		list.add(new Login("홍길동4", "40"));
		return list;
	}

	@RequestMapping("/ccc")

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
