package com.example.demo11.JavaBookExercise;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ChapterSix {

	@Test
	public void topic1() {
		int loop = 1000000;
		double sum = 0.0;
//		System.out.print("4 * (");
		for (int i = 1; i <= loop; i++) {
//			if (i == 1) {
//				System.out.print("1");
//			} else if (Math.pow(-1, i + 1) == 1) {
//				System.out.print(" + 1/" + number);
//			} else {
//				System.out.print(" - 1/" + number);
//			}

			sum += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
//			System.out.printf("i = %7d 時，PI = %15.14f%n", i, sum);
			if (i % 100000 == 0) {
				System.out.printf("i = %7d 時，PI = %15.14f%n", i, sum);

			}
		}

//		System.out.println(sum);
	}

	@Test
	public void topic2() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("");
//		int head = sc.nextInt();
//		System.out.print();
//		int foot = sc.nextInt();
		int head = 35;
		int foot = 130;
		int chicken;
		for (int rabbit = 0; rabbit < head; rabbit++) {
			chicken = head - rabbit;
			if (rabbit * 4 + chicken * 2 == foot) {
				System.out.println(rabbit + "隻兔子、" + chicken + "隻雞");
				return;
			}
		}
		System.out.println("無解");
	}

	@Test
	public void topic3() {
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			if (i == 0) {
				sum += 1;
			} else {
				sum += Math.pow(2, i);
			}
		}
		System.out.println(sum);
	}

	@Test
	public void ex1() {

	}

	@Test
	public void ex2() {

	}

	@Test
	public void ex3() {

	}

	@Test
	public void ex4() {

	}

	@Test
	public void ex5() {

	}

	@Test
	public void ex6() {

	}

	@Test
	public void ex7() {

	}

	@Test
	public void ex8() {

	}

	@Test
	public void ex9() {

	}

	@Test
	public void ex10() {

	}

}
