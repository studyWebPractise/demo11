package com.example.demo11;

public class Dog {

	String category;

	String color;

	String name;

	int age;

	// �]�B
	public void run() {
		System.out.println("���b�]!!");
	}

	// �W�r+�]�B
	public void running() {
		System.out.println(name + "���b�]!!");
	}

	public void eat(String name) {
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);
	}

}
