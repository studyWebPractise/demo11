package com.example.demo11;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class GuessNumber {

	@SuppressWarnings("resource")
	@Test
	public void main() {
		Random random = new Random();
		String topic = "";
		// 設定題目
		while (topic.length() < 4) {
			int number = random.nextInt(10);
			// 判斷數字是否重複 ""+int => int轉Stirng
			if (!topic.contains("" + number)) {
				topic = topic + number;
			}
		}
		System.out.println(topic);
		Scanner sc = new Scanner(System.in);
		String guess = "";
		while (true) {
			System.out.print("請輸入猜測的數字(4個數字):");
			// 檢驗
			while (true) {
				guess = sc.nextLine();
				// 檢驗長度
				if (guess.length() != 4) {
					System.out.print("此次輸入長度不為4，重新輸入:");
					continue;
				}
				// 檢驗數字異同
				HashSet<Integer> guessSet = new HashSet<Integer>();
				for (int i = 0; i < 4; i++) {
					int guessOne = (int) guess.charAt(i);
					guessSet.add(guessOne);
				}
				if (guessSet.size() != 4) {
					System.out.print("此次輸入有相同數字，重新輸入:");
					continue;
				}

				// 檢查非數字存在
				if (!guess.matches("\\d{4}")) {
					System.out.print("此次輸入有非數字，重新輸入:");
				} else {
					break;
				}

			}
			if (topic.equals(guess)) {
				System.out.println("BINGO~");
				break;
			}

			int a = 0;
			int b = 0;
			// 判斷AB
			for (int i = 0; i < 4; i++) {
//				System.out.println(topic.charAt(i));
//				System.out.println(topicSet);
				if (guess.charAt(i) == topic.charAt(i)) {
					a += 1;
				} else if (topic.indexOf(guess.charAt(i)) != -1) {
					b += 1;
				}
			}
			System.out.println("結果： " + a + "A" + b + "B");
		}

	}

}
