package com.dto;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu = (Student)ctx.getBean("xxx");
		stu.setAge(25);
		stu.setName("송지민");
		System.out.println(stu);
		
		Student stu2 = ctx.getBean("xxx", Student.class);
		stu2.setAge(20);
		stu2.setName("이순신");
		System.out.println(stu2);
		
		System.out.println(stu);	//이순신 출력됨 
	}

}
