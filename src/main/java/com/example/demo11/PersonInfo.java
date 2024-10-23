package com.example.demo11;

public class PersonInfo extends BankPerson {

	private String city;

	public PersonInfo(String id, String name, String city) {
		super(id, name);
		this.city = city;
	}

	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonInfo(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
