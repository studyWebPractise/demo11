package com.example.demo11;

public class Bird extends Animal {

	public Bird() {
		super();// 可寫可不寫
	}

	// 因為屬性是繼承來的 所以宣告的時候要用到父類別宣告方法
	public Bird(String name, int age) {
		super(name, age);
	}

	// super.getName() (|| getName())繼承父類別(超類別)的public方法
	// 因為在父類別 name是private
	public void flying() {
		System.out.println(super.getName() + "正在飛");
	}

	public void flying2() {
		System.out.println("今年" + age + "歲，" + getName() + "正在飛");
	}

	@Override
	
	public void eat() {
		System.out.println(getName() + "吃不停");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + "睡很多");
	}

}
