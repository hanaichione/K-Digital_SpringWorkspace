package com.spring;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		System.out.println(echo.getAnotherBean().getName());
		echo.getAnotherBean().getInfo();
		List<AnotherBean> list = echo.getValueList();
		for (AnotherBean anotherBean : list) {
			System.out.println(anotherBean.getName());
		}
		
	}
}
