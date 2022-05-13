package com.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.Login;

@Controller
public class TestController {

	@RequestMapping("/aaa")
	public String aaa(@RequestBody Login login) { // body로 넘어와서 login으로 담김
		System.out.println(login);
		return "hello";
	}

	@RequestMapping("/bbb")
	public String bbb(@RequestBody ArrayList<Login> list) { // body로 넘어와서 login으로 담김
		System.out.println(list);
		return "hello";
	}

	@RequestMapping("/ccc")
	public String ccc(String userid, String passwd) { // body로 넘어와서 login으로 담김
		System.out.println(userid + "\t" + passwd);
		return "main";
	}
	
	@RequestMapping("/ddd")
	public String ddd(String userid) { // body로 넘어와서 login으로 담김
		System.out.println(userid);
		return "main";
	}
}
