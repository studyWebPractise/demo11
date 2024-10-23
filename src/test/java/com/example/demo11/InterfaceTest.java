package com.example.demo11;

import org.junit.jupiter.api.Test;

public class InterfaceTest {

	@Test
	public void interfaceTest() {
		System.out.println(MyInterface.NUMBER);
	}
	
	@Test
	public void interface1Test() {
		Human human = new Human();
		human.run();
		
		Car car = new Car();
		car.run();
		
		Person person = new Person();
		person.run();
	}
}
