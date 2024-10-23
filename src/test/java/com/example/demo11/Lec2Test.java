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
		System.out.println(calRabbit(35, 129)); // 雞兔同籠
		System.out.println(ticket(30));
		System.out.println(score(100));

	}

	/**
	 * 計算範圍餒所有數字的總和
	 * 
	 * @param start 起始值
	 * @param end   結束值
	 * @return 總和值
	 */
	public int topic1(int start, int end) {
		int sum = (start + end) * (end - start + 1) / 2;
		return sum;
	}

	/**
	 * 計算1到結束值得總和
	 * 
	 * @param end 結束值
	 * @return 總和
	 */
	public int topicFor(int end) {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * 計算1到結束值得總和
	 * 
	 * @param end 結束值
	 * @return 總和
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
	 * 計算1到結束值得總和
	 * 
	 * @param end 結束值
	 * @return 總和
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
	 * 攝氏溫度轉換成華式溫度
	 * 
	 * @param celsius 攝氏溫度
	 */
	public double celsiusToFahrenheit(double celsius) {
		double fahrenheit = celsius * 9 / 5 + 32;
		return fahrenheit;
	}

	/**
	 * 華氏溫度轉換成攝式溫度
	 * 
	 * @param fahrenheit 華氏溫度
	 * @return 攝式溫度
	 */
	public double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	/**
	 * for迴圈-九九乘法表
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
	 * while迴圈-九九乘法表
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
	 * 雞兔同籠
	 * 
	 * @param head 頭數目
	 * @param foot 腳數目
	 * @return
	 */
	public String calRabbit(int head, int foot) {
		int chicken;
		for (int rabbit = 0; rabbit < head; rabbit++) {
			chicken = head - rabbit;
			if (rabbit * 4 + chicken * 2 == foot) {
				return rabbit + "隻兔子、" + chicken + "隻雞";
			}
		}
		return "無解";
	}

	/**
	 * 票價
	 * @param age 年齡
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
	 * 成績判斷
	 * 
	 * @param number 輸入成績
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
	 * 猜數字
	 */
	@Test
	public void guess() {
		try (Scanner sc = new Scanner(System.in)) {
			Random random = new Random();
			// 亂數產生題目數字
			int topic = random.nextInt(96) + 2;

			// 第一次猜數字
			System.out.print("請在 1~99 範圍內猜個數字: ");
			int number = sc.nextInt();
			// 檢測數字範圍
			while (number > 99 || number < 0) {
				System.out.print("此數字不在1~99中，請重新輸入: ");
				number = sc.nextInt();
			}
			// 設定上下限
			int smallWall = 1;
			int bigWall = 99;
			// 驗證答案
			while (topic != number) {
				if (topic > number) { // 數字比較小 更新下限
					smallWall = number;
				} else { // 數字比較大 更新上限
					bigWall = number;
				}
				// 再次猜測
				System.out.print("請在 " + smallWall + "~" + bigWall + " 範圍內猜個數字: ");
				number = sc.nextInt();
				// 檢測數字範圍
				while (number > bigWall || number < smallWall) {
					System.out.print("此數字不在" + smallWall + "~" + bigWall + "中，請重新輸入: ");
					number = sc.nextInt();
				}
			}
			System.out.println("BINGO~");
		} catch (InputMismatchException ex) {
			System.out.println("遊戲結束，必須輸入整數!!");
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
			System.out.println("for迴圈已結束");
		}
		System.out.println("one迴圈已結束");
	}

}
