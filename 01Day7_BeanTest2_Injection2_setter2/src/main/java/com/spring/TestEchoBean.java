package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestEchoBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
//		EchoBean eb = ctx.getBean("echoBean", EchoBean.class);
//		AnotherBean ab = eb.getXxx();
		AnotherBean ab = ctx.getBean("anotherBean", AnotherBean.class);
		System.out.println(ab.getName() + "\t" + ab.getAge());
	}

}
