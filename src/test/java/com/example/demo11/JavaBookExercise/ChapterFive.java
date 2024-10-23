package com.example.demo11.JavaBookExercise;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ChapterFive {
	Scanner sc = new Scanner(System.in);

	@Test
	public void topic1() {
		System.out.print("�п�J����(cm):");
		int height = sc.nextInt();
		System.out.print("�п�J�魫(kg):");
		int weight = sc.nextInt();
		double bmi = weight / Math.pow((height / 100.0), 2);
		System.out.println("BMI = " + bmi);
		if (bmi < 18.5) {
			System.out.println("�L��");
		} else if (bmi < 24) {
			System.out.println("���`");
		} else if (bmi < 28) {
			System.out.println("�W��");
		} else {
			System.out.println("�έD");
		}
	}

	@Test
	public void topic2() {
		System.out.print("�п�J�褸�X���~:");
		int year = sc.nextInt();
		year -= 1900;
		switch (year % 12) {
		case 0:
			System.out.println("�A���ͨv�O: ��");
			break;

		case 1:
		case -11:
			System.out.println("�A���ͨv�O: ��");
			break;
		case 2:
		case -10:
			System.out.println("�A���ͨv�O: ��");
			break;

		case 3:
		case -9:
			System.out.println("�A���ͨv�O: ��");
			break;

		case 4:
		case -8:
			System.out.println("�A���ͨv�O: �s");
			break;

		case 5:
		case -7:
			System.out.println("�A���ͨv�O: �D");
			break;

		case 6:
		case -6:
			System.out.println("�A���ͨv�O: ��");
			break;

		case 7:
		case -5:
			System.out.println("�A���ͨv�O: ��");
			break;

		case 8:
		case -4:
			System.out.println("�A���ͨv�O: �U");
			break;

		case 9:
		case -3:
			System.out.println("�A���ͨv�O: ��");
			break;

		case 10:
		case -2:
			System.out.println("�A���ͨv�O: ��");
			break;

		case 11:
		case -1:
			System.out.println("�A���ͨv�O: ��");
			break;

		}
	}

	@Test
	public void topic3() {
		System.out.print("�п�J�t��(km/h):");
		double v = sc.nextDouble();
		if (v == 7.9) {
			System.out.println("�H�y�ìP�i�H��¶�a�y����β���");
		} else if (v >= 16.7) {
			System.out.println("�H�y�ìP�i�H�����Ӷ��t");
		} else if (v > 11.2) {
			System.out.println("�H�y�ìP�i�H��¶�Ӷ�����");
		} else if (v > 7.9) {
			System.out.println("�H�y�ìP�i�H��¶�a�y�����β���");
		} else {
			System.out.println("�H�y�ìP�L�k�i�J�Ӫ�");
		}
	}

	@Test
	public void ex1() {
		System.out.print("�п�J���:");
		int number = sc.nextInt();
		System.out.print("��J�O");
		if (number == 0) {
			System.out.println("0");
		} else if (number % 2 == 0) {
			System.out.println("����");
		} else {
			System.out.println("�_��");
		}
	}

	@Test
	public void ex2() {
		System.out.print("�п�J3�Ӿ��(�Ʀr���Ϊťդ��}):");
		String input = sc.nextLine();
		int[] list = new int[3];
		int i = 0;
		for (String temp : input.split(" ")) {
			list[i] = Integer.valueOf(temp).intValue();
			i += 1;
		}
		Arrays.sort(list);
		System.out.print("�j��p���O�O ");
		for (int j = list.length-1; j >=0 ; j--) {
			System.out.print(list[j]+", ");
		}
	}

	@Test
	public void ex3() {
		System.out.print("�п�J�y��(�Ʀr���Ϊťդ��}):");
		String input = sc.nextLine();
		int[] list = new int[3];
		int i = 0;
		for (String temp : input.split(" ")) {
			list[i] = Integer.valueOf(temp).intValue();
			i += 1;
		}
		double len = Math.sqrt(Math.pow(list[0], 2)+Math.pow(list[1], 2));
		if (len < 20) {
			System.out.println("�b�ꤺ");
		} else {
			System.out.println("�b��~");
		}
	}

	@Test
	public void ex4() {
		System.out.print("�Фu�@�ɼ�:");
		int hours = sc.nextInt();
		double basic = 150.0;
		if (hours==40) {
		} else if (hours<40) {
			basic*=0.8;
		} else if (hours<=50) {
			basic*=1.2;
		} else if (hours>50) {
			basic*=1.6;
		} 
		System.out.println("���g�~��:"+hours*basic);
	}

	@Test
	public void ex5() {
		System.out.print("���ѬO�P����A�п�J�Ѽ�:");
		int days = sc.nextInt();
		System.out.print(days+"�ѫ�O�P��");
		switch (days%7) {
		case 0:
			System.out.println("��");
			break;
		case 1:
			System.out.println("�@");
			break;
		case 2:
			System.out.println("�G");
			break;
		case 3:
			System.out.println("�T");
			break;
		case 4:
			System.out.println("�|");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		}
	}

	@Test
	public void ex7() {
		System.out.print("�п�J����(cm):");
		int height = sc.nextInt();
		if (height>=200) {
			System.out.println("�o�O���W�H��");
		} else if (height>=192) {
			System.out.println("�o�O�e�W�H��");
		} else {
			System.out.println("�o�O��äH��");
		}
	}
}
