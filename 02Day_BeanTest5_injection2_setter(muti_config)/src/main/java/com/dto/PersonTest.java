package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo1.xml", "classpath:echo2.xml");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/*.xml");
		Person p = ctx.getBean("onePerson", Person.class);
		System.out.println(p);
	}

}
