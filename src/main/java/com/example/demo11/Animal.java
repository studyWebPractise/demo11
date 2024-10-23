package com.example.demo11;

public class Animal {
	private String name;

	protected int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Animal() {
		//super前面不能放程式碼
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "正在吃東西");
	}

	public void sleep() {
		System.out.println(name + "正在睡覺");
	}
}
