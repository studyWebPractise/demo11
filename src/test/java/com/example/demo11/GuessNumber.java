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
		// �]�w�D��
		while (topic.length() < 4) {
			int number = random.nextInt(10);
			// �P�_�Ʀr�O�_���� ""+int => int��Stirng
			if (!topic.contains("" + number)) {
				topic = topic + number;
			}
		}
		System.out.println(topic);
		Scanner sc = new Scanner(System.in);
		String guess = "";
		while (true) {
			System.out.print("�п�J�q�����Ʀr(4�ӼƦr):");
			// ����
			while (true) {
				guess = sc.nextLine();
				// �������
				if (guess.length() != 4) {
					System.out.print("������J���פ���4�A���s��J:");
					continue;
				}
				// ����Ʀr���P
				HashSet<Integer> guessSet = new HashSet<Integer>();
				for (int i = 0; i < 4; i++) {
					int guessOne = (int) guess.charAt(i);
					guessSet.add(guessOne);
				}
				if (guessSet.size() != 4) {
					System.out.print("������J���ۦP�Ʀr�A���s��J:");
					continue;
				}

				// �ˬd�D�Ʀr�s�b
				if (!guess.matches("\\d{4}")) {
					System.out.print("������J���D�Ʀr�A���s��J:");
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
			// �P�_AB
			for (int i = 0; i < 4; i++) {
//				System.out.println(topic.charAt(i));
//				System.out.println(topicSet);
				if (guess.charAt(i) == topic.charAt(i)) {
					a += 1;
				} else if (topic.indexOf(guess.charAt(i)) != -1) {
					b += 1;
				}
			}
			System.out.println("���G�G " + a + "A" + b + "B");
		}

	}

}
