package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		Person p = ctx.getBean("onePerson", Person.class);
		Cat c = p.getCat();
		System.out.println(c.getCatName() + "\t" + c.getCatAge());
		System.out.println(p);
	}

}
