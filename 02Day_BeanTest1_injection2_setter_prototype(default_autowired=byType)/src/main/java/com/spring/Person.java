package com.spring;

public class Person {
	String username;
	int age;
	Cat cat;	// bean id와 일치
	Dog dog;	// bean id와 일치
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, int age, Cat cat, Dog dog) {
		super();
		this.username = username;
		this.age = age;
		this.cat = cat;
		this.dog = dog;
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
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		System.out.println("setCat 호출됨");
		this.cat = cat;
	}
	public Dog getDog() {
		System.out.println("setDog 호출됨");
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cat=" + cat + ", dog=" + dog + "]";
	}
	
}
