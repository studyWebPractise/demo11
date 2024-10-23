package com.example.demo11;

public class Dog {

	String category;

	String color;

	String name;

	int age;

	// 跑步
	public void run() {
		System.out.println("正在跑!!");
	}

	// 名字+跑步
	public void running() {
		System.out.println(name + "正在跑!!");
	}

	public void eat(String name) {
		System.out.println(this.name + "很愛吃變成" + name);
	}

}
