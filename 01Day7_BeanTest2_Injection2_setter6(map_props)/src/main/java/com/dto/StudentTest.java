package com.dto;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu);
		Map<String, Cat> map = stu.getMapCat();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		System.out.println("===========================");
		Properties props = stu.getPhones();
		Set<String> xxx = props.stringPropertyNames();
		for (String key : xxx) {
			System.out.println(props.get(key));
		}
	}

}
