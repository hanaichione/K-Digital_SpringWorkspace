package com.dto;

public class Student {
	
	private String name;
	private int age;

	public void getInfo() {
		System.out.println("getInfo()=====================");
	}
	
	// init-method : 초기화작업, xml에 등록하여 init함수로 사용 가능
	public void aaa() {
		System.out.println("init-method.aaa");
	}
	
	// destroy-method : 자원 반납, xml에 등록하여 destory함수로 사용 가능
	public void bbb() {
		System.out.println("destroy-method.bbb");
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
