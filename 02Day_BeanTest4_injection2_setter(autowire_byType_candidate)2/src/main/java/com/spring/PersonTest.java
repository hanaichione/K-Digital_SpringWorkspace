package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p = ctx.getBean("onePerson", Person.class);
		
		System.out.println(p.getCat() + "\t" + p.getDog());
	}

}
