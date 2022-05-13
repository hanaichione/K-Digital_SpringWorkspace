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

	@RequestMapping(value="/board", method = RequestMethod.GET)
	public String get() {
		System.out.println("get======================");
		return "main";
	}
	
	@RequestMapping(value="/board", method = RequestMethod.POST)
	public String POST() {
		System.out.println("POST======================");
		return "main";
	}
	
	@RequestMapping(value="/board", method = RequestMethod.PUT)
	public String PUT() {
		System.out.println("PUT======================");
		return "main";
	}
	
	@RequestMapping(value="/board", method = RequestMethod.DELETE)
	public String DELETE() {
		System.out.println("DELETE======================");
		return "main";
	}
}
