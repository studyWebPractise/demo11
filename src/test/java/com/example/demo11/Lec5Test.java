package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec5Test {

	@Test
	public void one() {
		Scanner sc = new Scanner(System.in);
		String topic = sc.nextLine();
//		int a = findSamChar(topic, "A", 0, 0);
//		int b = findSamChar(topic, "B", 0, 0);
//		int c = findSamChar(topic, "C", 0, 0);
//		int d = findSamChar(topic, "D", 0, 0);
//		System.out.println(a + "個A " + b + "個B " + c + "個C " + d + "個D");

//		this.method2(topic);

//		this.method3(topic);

//		int a = this.method4(topic, "A");
//		int b = this.method4(topic, "B");
//		int c = this.method4(topic, "C");
//		int d = this.method4(topic, "D");
//		System.out.println(a + "個A " + b + "個B " + c + "個C " + d + "個D");

//		this.method5(topic);

		this.method6(topic);

	}

	public int findSamChar(String topic, String want, int findEnd, int start) {
		// 如果找不到，結束遞迴
		if (topic.indexOf(want, start) == -1) {
			return findEnd;
		}
		// 下次遞迴從找到的隔壁開始找
		start = topic.indexOf(want, start) + 1;
		// 紀錄找到次數
		findEnd += 1;
		// 下一次的遞迴
		return findSamChar(topic, want, findEnd, start);
	}

	public void method2(String topic) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		char[] topicChar = topic.toCharArray();
		for (char temp : topicChar) {
			switch (temp) {
			case 'A':
				a += 1;
				break;
			case 'B':
				b += 1;
				break;
			case 'C':
				c += 1;
				break;
			case 'D':
				d += 1;
				break;
			}
		}
		System.out.println(a + "個A " + b + "個B " + c + "個C " + d + "個D");
	}

	public void method3(String topic) {
		int start = 0;
		int a = 0;
		while (topic.indexOf("A", start) != -1) {
			start = topic.indexOf("A", start) + 1;
			a += 1;
		}

		start = 0;
		int b = 0;
		while (topic.indexOf("B", start) != -1) {
			start = topic.indexOf("B", start) + 1;
			b += 1;
		}

		start = 0;
		int c = 0;
		while (topic.indexOf("C", start) != -1) {
			start = topic.indexOf("C", start) + 1;
			c += 1;
		}

		start = 0;
		int d = 0;
		while (topic.indexOf("D", start) != -1) {
			start = topic.indexOf("D", start) + 1;
			d += 1;
		}
		System.out.println(a + "個A " + b + "個B " + c + "個C " + d + "個D");
	}

	public int method4(String topic, String want) {
		int start = 0;
		int find = 0;
		while (topic.indexOf(want, start) != -1) {
			start = topic.indexOf(want, start) + 1;
			find += 1;
		}
		return find;
	}

	public void method5(String topic) {
		char[] want = { 'A', 'B', 'C', 'D' };
		for (char temp : want) {
			System.out.print(this.method4(topic, String.valueOf(temp)) + "個" + temp + " ");
		}
	}

	public void method6(String topic) {
		char[] want = { 'A', 'B', 'C', 'D' };
		for (char temp : want) {
			if (topic.length() == 0) {
				return;
			}
			int oldLen = topic.length();
			topic = topic.replace(String.valueOf(temp), "");
			System.out.print((oldLen - topic.length()) + "個" + temp + " ");
		}
	}

	@Test
	public void stringBufferTest() {
		StringBuffer sb = new StringBuffer("abc");
		sb.append("ABC");
	}
}
