package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ClassTest {

	@Test
	public void dogTest() {
		Dog dog = new Dog();
		dog.age = 1;
		dog.category = "�䪪";
		dog.color = "�¥�";
		dog.name = "�䪪";

		System.out.println(dog.category);
		dog.eat("�D�䪪");
	}
}
