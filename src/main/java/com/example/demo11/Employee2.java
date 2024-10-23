package com.example.demo11;

public class Employee2 extends HomeTown {

	private String id;

	private String name;

	private int age;

	private String gender;

	public Employee2(String city, String state, String country, String id, String name, //
			int age, String gender) {
		super(city, state, country);
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee2() {
		super();
	}

	public Employee2(String city, String state, String country) {
		super(city, state, country);
	}
	
}
