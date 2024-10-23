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
		//super�e�������{���X
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "���b�Y�F��");
	}

	public void sleep() {
		System.out.println(name + "���b��ı");
	}
}
