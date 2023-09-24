package com.kodnest.encapsulation;

public class Dog {
	private String name;
	private String color;
	private String breed;
	private int age;
	public Dog(String name, String color, String breed, int age) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	

}
