package com.example.demo11.JavaBookExercise;

import org.junit.jupiter.api.Test;

public class ChapterThree {

	@Test
	public void ex1() {
		System.out.println("�{�����ex3_1.java");
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
		System.out.println("���n�G" + height * weight);
		System.out.println("�P���G" + 2 * (height + weight));
	}

	@Test
	public void ex4() {
		char character = 65;
		for (int i = 0; i < 6; i++) {
			System.out.println("�ܼ�ch�����e = " + character);
			character += 1;
		}
	}

	@Test
	public void ex5() {
		final double PI = 3.14159;
		int r = 10;
		System.out.println("r = " + r + ",��P�� = " + (2 * PI * r));
		System.out.println("r = " + r + ",�ꭱ�n = " + (PI * r * r));
		r = 20;
		System.out.println("r = " + r + ",��P�� = " + (2 * PI * r));
		System.out.println("r = " + r + ",�ꭱ�n = " + (PI * r * r));
	}
	
	@Test
	public void ex6() {
		System.out.println((int)0b11110010);
		System.out.println((int)07654);
		System.out.println((int)0xaaabbb);
	}
	
}
