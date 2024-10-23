package com.example.demo11.JavaBookExercise;

import org.junit.jupiter.api.Test;

public class ChapterThree {

	@Test
	public void ex1() {
		System.out.println("程式實例ex3_1.java");
	}

	@Test
	public void ex2() {
		int pay = 150;
		int cost = 10000;
		int store = pay * 8 * 300 - cost * 12;
		System.out.println(store);
	}

	@Test
	public void ex3() {
		int height = 5;
		int weight = 10;
		System.out.println("面積：" + height * weight);
		System.out.println("周長：" + 2 * (height + weight));
	}

	@Test
	public void ex4() {
		char character = 65;
		for (int i = 0; i < 6; i++) {
			System.out.println("變數ch的內容 = " + character);
			character += 1;
		}
	}

	@Test
	public void ex5() {
		final double PI = 3.14159;
		int r = 10;
		System.out.println("r = " + r + ",圓周長 = " + (2 * PI * r));
		System.out.println("r = " + r + ",圓面積 = " + (PI * r * r));
		r = 20;
		System.out.println("r = " + r + ",圓周長 = " + (2 * PI * r));
		System.out.println("r = " + r + ",圓面積 = " + (PI * r * r));
	}
	
	@Test
	public void ex6() {
		System.out.println((int)0b11110010);
		System.out.println((int)07654);
		System.out.println((int)0xaaabbb);
	}
	
}
