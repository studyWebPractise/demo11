package com.example.demo11.JavaBookExercise;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ChapterFour {

	@Test
	public void topic1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��J���ū�:");
		double celsius = sc.nextDouble();
		double fahrenheit = celsius * 9 / 5 + 32;
		System.out.println("�ؤ�ū�:" + fahrenheit);
	}

	@Test
	public void topic2() {
		int start = 1;
		int end = 100;
		int sum = (start + end) * (end - start + 1) / 2;
		System.out.println(start + "��" + end + "�`�M�O:" + sum);
	}

	@Test
	public void ex1() {
		int x;
		x = 6 * 8 - 7 * 6 >> 2;
		System.out.println(x);

		x = 6 >> 5 * 8 - 10 * 4 + 1;
		System.out.println(x);

		x = 5 + 6 << 2;
		System.out.println(x);

		x = 7 * 3 + 8 >> 3;
		System.out.println(x);
	}

	@Test
	public void ex2() {
		int a = 10;
		int b = 18;
		int c = 5;
		int x;
		x = a + b - c;
		System.out.println(x);

		x = 2 * a + 3 - c;
		System.out.println(x);

		x = b * c + 18 / b;
		System.out.println(x);

		x = a % c * b + 10;
		System.out.println(x);

		x = a * c - a * b * c;
		System.out.println(x);
	}

	@Test
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		int number;
		while (true) {
			System.out.println("�п�J�p��10�����:");
			number = sc.nextInt();
			if (number < 10) {
				break;
			}
		}
		System.out.println("����O:" + Math.pow(number, 2));

		System.out.println("�ߤ�O:" + Math.pow(number, 3));

	}

	@Test
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		int number;
		while (true) {
			System.out.println("�п�J�p��10�����:");
			number = sc.nextInt();
			if (number < 10) {
				break;
			}
		}
		System.out.println(number + "������O:" + Math.pow(number, 2));

		System.out.println(number + "���ߤ�O:" + Math.pow(number, 3));
	}

	@Test
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�^��:");
		int number = sc.nextInt();
		System.out.println("�����O:" + number * 1.609);
	}

	@Test
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��J�ؤ�ū�:");
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("���ū�:" + celsius);

	}

	@Test
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��J�ƦC�_�l��:");
		int start = sc.nextInt();
		System.out.println("��J�ƦC������:");
		int end = sc.nextInt();
		System.out.println("��J�ƦC�t����:");
		int d = sc.nextInt();
		int n = (end - start) / d + 1;
		int sum = n * (start + end) / 2;
		System.out.println(start + "��" + end + "�t���ȬO" + d + "���ƦC�`�M�O:" + sum);

	}

	@Test
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��J������:");
		int end = sc.nextInt();
		double sum = 0.0;
		int time = 1;
		int number = 1;
		System.out.print("4 * (");
		for (int i = 1; i <= end; i++) {
			if (i==1) {
				System.out.print("1");
			} else if (time==1) {
				System.out.print(" + 1/" + number);
			}else {
				System.out.print(" - 1/" + number);
			}
			
			sum += (1.0 /  number * time);
//			System.out.println(number *time);
			number += 2;
			time *= -1;
		}
		System.out.print(") = " + 4 * sum);
	}

	@Test
	public void ex9() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("��J������:");
//		int end = sc.nextInt();
		int end = 8;
		double sum = 3.0;
		int time = 1;
		System.out.print("3");
		for (int i = 2; i<=end;i+=2) {
			if (time>0) {
				System.out.print(" + 4/("+i+"*"+(i+1)+"*"+(i+2)+")");
			}else {
				System.out.print(" - 4/("+i+"*"+(i+1)+"*"+(i+2)+")");

			}
			sum += 4.0/(i*(i+1)*(i+2))*time;
			time *= -1;
		}
		System.out.print("= " + sum);
//		System.out.println(sum);
		
	}

}
