package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p = ctx.getBean("one", Person.class);
		
		System.out.println(p.getUsername() + "\t" + p.getAge() + "\t" + p.getCat().catName + "\t" + p.getCat().catAge + "\t" + p.getDog().DogName + "\t" + p.getDog().DogAge);
		System.out.println(p);
		
		Person p2 = ctx.getBean("two", Person.class);
		System.out.println(p2);
	}

}
