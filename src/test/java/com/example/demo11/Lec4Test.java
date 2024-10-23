package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Lec4Test {

	@Test
	public void calGrade() {
		int[] grade = { 60, 20, 70, 40, 50 };
		this.showEndSort(grade);
	}

	public void showEnd(int[] grade) {
		System.out.print("┮Τ蝶糵だ计:");
		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " ");
		}
		System.out.println();
		int numberMax = 0;
		int numberMin = grade[0];
		int sum = 0;
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] > numberMax) {
				numberMax = grade[i];
			} else if (grade[i] < numberMin) {
				numberMin = grade[i];
			}
			sum += grade[i];
		}
		System.out.println(numberMax);
		System.out.println(numberMin);
		System.out.println("Τだ计: " + (sum - numberMax - numberMin) / (grade.length - 2));
	}

	public void showEndSort(int[] grade) {
		System.out.print("┮Τ蝶糵だ计:");
		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " ");
		}
		System.out.println();
		Arrays.sort(grade);
		int sum = 0;
		for (int i = 1; i < grade.length - 1; i++) {
			sum += grade[i];
		}
		System.out.println("Τだ计: " + sum / (grade.length - 2));
	}

	@Test
	public void randomFourNumberString() {
		Random random = new Random();
		String topic = "";

		while (topic.length() < 4) {
			int number = random.nextInt(10);
			if (!topic.contains("" + number)) {
				topic = topic + number;
			}
		}
		System.out.println(topic);
	}

	@Test
	public void randomFourNumberList() {
		Random random = new Random();
		List<Integer> topic = new ArrayList<Integer>();

		out: while (topic.size() < 4) {
			int number = random.nextInt(10);
			for (int temp : topic) {
				if (temp == number) {
					continue out;
				}
			}
			topic.add(number);
		}

		for (int i = 0; i < topic.size(); i++) {
			System.out.print(topic.get(i));
		}
	}
}
