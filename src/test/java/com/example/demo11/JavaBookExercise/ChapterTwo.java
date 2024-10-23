package com.example.demo11.JavaBookExercise;

import org.junit.jupiter.api.Test;

public class ChapterTwo {

	@Test
	public void ex1() {
		System.out.println("我愛java");
		System.out.println("java是一個功能強大的程式語言");
	}
	
	@Test
	public void ex2() {
		System.out.println("李白");
		System.out.println("花間一壺酒，");
		System.out.println("獨酌無雙親；");
		System.out.println("舉杯邀明月，");
		System.out.println("對影成三人。");
	}
	@Test
	public void ex3() {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i*2; j++) {
				System.out.print("a");
			}
			System.out.println();
		}
	}
}
