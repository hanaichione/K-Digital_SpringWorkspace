package com.dto;

public class Student {
	String username="이순신";
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("student 기본 생성자");
	}
	public Student(String username, int age) {
		super();
		this.username = username;
		this.age = age;
		System.out.println("student인자 있는 생성자");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}

}
