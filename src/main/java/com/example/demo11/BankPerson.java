package com.example.demo11;

public class BankPerson {

	protected String id;

	protected String name;

	public BankPerson(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public BankPerson() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
