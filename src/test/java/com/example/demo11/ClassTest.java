package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {

	@Test
	public void dogTest() {
		Dog dog = new Dog();
		dog.age = 1;
		dog.category = "邊牧";
		dog.color = "黑白";
		dog.name = "邊牧";

		System.out.println(dog.category);
		dog.eat("胖邊牧");
	}
}
