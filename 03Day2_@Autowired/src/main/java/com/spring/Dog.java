package com.spring;

public class Dog {
	String DogName;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String dogName) {
		super();
		DogName = dogName;
	}

	public String getDogName() {
		return DogName;
	}

	public void setDogName(String dogName) {
		DogName = dogName;
	}

	@Override
	public String toString() {
		return "Dog [DogName=" + DogName + "]";
	}
	
	
}
