package com.example.demo11;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class Lec2Test {

	@Test
	public void reviewLec1() {
		int a = 1;
		String b = "111";
		int c = a++;
		System.out.println(c + ":" + a);
		int d = ++a;

		System.out.println(d + ":" + a);

	}

	@Test
	public void test2() {
		int a = 5;
		System.out.print("a = a + 9: a = ");
		System.out.println(a += 9);
		System.out.print("a = a - 1: a = ");
		System.out.println(a--);
		System.out.print("a = 5 * a: a = ");
		System.out.println(a *= 5);

		int b = 2;
		a = b / 5;
		System.out.print("a = b / 5: a = ");
		System.out.println(a);
		System.out.print("a = a % b: a = ");
		System.out.println(a %= b);
		a = b % a;
		System.out.print("a = b % a: a = ");
		System.out.println(a);
	}

	@Test
	public void topic() {
		System.out.println(topic1(1, 100));
		System.out.println(topicFor(100));
		System.out.println(topicWhile(100));
		System.out.println(topicDoWhile(100));
		System.out.println(celsiusToFahrenheit(36.0));
		System.out.println(fahrenheitToCelsius(96.8));
		System.out.println(calRabbit(35, 129)); // ���ߦPŢ
		System.out.println(ticket(30));
		System.out.println(score(100));

	}

	/**
	 * �p��d��k�Ҧ��Ʀr���`�M
	 * 
	 * @param start �_�l��
	 * @param end   ������
	 * @return �`�M��
	 */
	public int topic1(int start, int end) {
		int sum = (start + end) * (end - start + 1) / 2;
		return sum;
	}

	/**
	 * �p��1�쵲���ȱo�`�M
	 * 
	 * @param end ������
	 * @return �`�M
	 */
	public int topicFor(int end) {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * �p��1�쵲���ȱo�`�M
	 * 
	 * @param end ������
	 * @return �`�M
	 */
	public int topicWhile(int end) {
		int sum = 0;
		int i = 1;
		while (end >= i) {
			sum += i;
			i++;
		}
		return sum;
	}

	/**
	 * �p��1�쵲���ȱo�`�M
	 * 
	 * @param end ������
	 * @return �`�M
	 */
	public int topicDoWhile(int end) {
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
		} while (end >= i);
		return sum;
	}

	/**
	 * ���ū��ഫ���ئ��ū�
	 * 
	 * @param celsius ���ū�
	 */
	public double celsiusToFahrenheit(double celsius) {
		double fahrenheit = celsius * 9 / 5 + 32;
		return fahrenheit;
	}

	/**
	 * �ؤ�ū��ഫ���ᦡ�ū�
	 * 
	 * @param fahrenheit �ؤ�ū�
	 * @return �ᦡ�ū�
	 */
	public double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	/**
	 * for�j��-�E�E���k��
	 */
	@Test
	public void tablaFor() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%2d\t", i, j, i * j);
			}
			System.out.println();
		}
	}

	/**
	 * while�j��-�E�E���k��
	 */
	@Test
	public void tablaWhile() {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d*%d=%2d\t", i, j, i * j);
				j += 1;
			}
			System.out.println();
			i += 1;
		}
	}

	/**
	 * ���ߦPŢ
	 * 
	 * @param head �Y�ƥ�
	 * @param foot �}�ƥ�
	 * @return
	 */
	public String calRabbit(int head, int foot) {
		int chicken;
		for (int rabbit = 0; rabbit < head; rabbit++) {
			chicken = head - rabbit;
			if (rabbit * 4 + chicken * 2 == foot) {
				return rabbit + "���ߤl�B" + chicken + "����";
			}
		}
		return "�L��";
	}

	/**
	 * ����
	 * @param age �~��
	 * @return
	 */
	public int ticket(int age) {
		int price = 100;
		if (age <= 6 || age >= 80) {
			return (int)(price * 0.2);
		} else if (age < 12 || age > 60) {
			return (int)(price * 0.5);
		} else {
			return (int)price;
		}
	}

	/**
	 * ���Z�P�_
	 * 
	 * @param number ��J���Z
	 * @return
	 */
	public String score(int number) {
		switch (number / 10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "E";
		}
	}

	/**
	 * �q�Ʀr
	 */
	@Test
	public void guess() {
		try (Scanner sc = new Scanner(System.in)) {
			Random random = new Random();
			// �üƲ����D�ؼƦr
			int topic = random.nextInt(96) + 2;

			// �Ĥ@���q�Ʀr
			System.out.print("�Цb 1~99 �d�򤺲q�ӼƦr: ");
			int number = sc.nextInt();
			// �˴��Ʀr�d��
			while (number > 99 || number < 0) {
				System.out.print("���Ʀr���b1~99���A�Э��s��J: ");
				number = sc.nextInt();
			}
			// �]�w�W�U��
			int smallWall = 1;
			int bigWall = 99;
			// ���ҵ���
			while (topic != number) {
				if (topic > number) { // �Ʀr����p ��s�U��
					smallWall = number;
				} else { // �Ʀr����j ��s�W��
					bigWall = number;
				}
				// �A���q��
				System.out.print("�Цb " + smallWall + "~" + bigWall + " �d�򤺲q�ӼƦr: ");
				number = sc.nextInt();
				// �˴��Ʀr�d��
				while (number > bigWall || number < smallWall) {
					System.out.print("���Ʀr���b" + smallWall + "~" + bigWall + "���A�Э��s��J: ");
					number = sc.nextInt();
				}
			}
			System.out.println("BINGO~");
		} catch (InputMismatchException ex) {
			System.out.println("�C�������A������J���!!");
		}
	}

	@Test
	public void forLabel() {
		one: for (int i = 0; i < 10; i++) {
			System.out.println("one: " + i);
			for (int j = 0; j < 10; j += 2) {
				System.out.println("two: " + j);
//				break one;
				break;
			}
			System.out.println("for�j��w����");
		}
		System.out.println("one�j��w����");
	}

}
