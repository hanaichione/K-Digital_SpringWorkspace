package com.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	
	@RequestMapping(value="/test")
	public String test() {
		System.out.println("test=============");
		return "main";	
	}
	
	@RequestMapping(value="/board/name/{xxx}")
	public String aaa(@PathVariable("xxx") String name) {
		System.out.println("aaa @PathVariable(\"xxx\") = " + name);
		return "main";
	}

	@RequestMapping(value="/board2/name/{xxx}/age/{yyy}")
	public String aaa2(@PathVariable("xxx") String name,
			@PathVariable("yyy") int age) {
		System.out.println("aaa @PathVariable(\"xxx\") = " + name + "\t" + age);
		return "main";
	}
}
