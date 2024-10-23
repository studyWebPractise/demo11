package com.example.demo11;

public class Father {
	private String name;

	public Father(String name) {
		super();
		this.name = name;
	}

	public Father() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println(name + " is walking!");
	}
}
