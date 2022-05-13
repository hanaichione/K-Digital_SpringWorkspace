package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student{
	
	private String name;
	private int age;

	@PostConstruct
	public void aaa() {
		System.out.println("init-method.aaa");
	}
	@PreDestroy
	public void bbb() {
		System.out.println("destroy-method.bbb");
	}
	
	public void getInfo() {
		System.out.println("getInfo()=====================");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
