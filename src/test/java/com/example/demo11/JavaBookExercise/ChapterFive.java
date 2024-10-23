package com.example.demo11.JavaBookExercise;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ChapterFive {
	Scanner sc = new Scanner(System.in);

	@Test
	public void topic1() {
		System.out.print("請輸入身高(cm):");
		int height = sc.nextInt();
		System.out.print("請輸入體重(kg):");
		int weight = sc.nextInt();
		double bmi = weight / Math.pow((height / 100.0), 2);
		System.out.println("BMI = " + bmi);
		if (bmi < 18.5) {
			System.out.println("過輕");
		} else if (bmi < 24) {
			System.out.println("正常");
		} else if (bmi < 28) {
			System.out.println("超重");
		} else {
			System.out.println("肥胖");
		}
	}

	@Test
	public void topic2() {
		System.out.print("請輸入西元出身年:");
		int year = sc.nextInt();
		year -= 1900;
		switch (year % 12) {
		case 0:
			System.out.println("你的生肖是: 鼠");
			break;

		case 1:
		case -11:
			System.out.println("你的生肖是: 牛");
			break;
		case 2:
		case -10:
			System.out.println("你的生肖是: 虎");
			break;

		case 3:
		case -9:
			System.out.println("你的生肖是: 兔");
			break;

		case 4:
		case -8:
			System.out.println("你的生肖是: 龍");
			break;

		case 5:
		case -7:
			System.out.println("你的生肖是: 蛇");
			break;

		case 6:
		case -6:
			System.out.println("你的生肖是: 馬");
			break;

		case 7:
		case -5:
			System.out.println("你的生肖是: 羊");
			break;

		case 8:
		case -4:
			System.out.println("你的生肖是: 猴");
			break;

		case 9:
		case -3:
			System.out.println("你的生肖是: 雞");
			break;

		case 10:
		case -2:
			System.out.println("你的生肖是: 狗");
			break;

		case 11:
		case -1:
			System.out.println("你的生肖是: 豬");
			break;

		}
	}

	@Test
	public void topic3() {
		System.out.print("請輸入速度(km/h):");
		double v = sc.nextDouble();
		if (v == 7.9) {
			System.out.println("人造衛星可以環繞地球做圓形移動");
		} else if (v >= 16.7) {
			System.out.println("人造衛星可以脫離太陽系");
		} else if (v > 11.2) {
			System.out.println("人造衛星可以環繞太陽移動");
		} else if (v > 7.9) {
			System.out.println("人造衛星可以環繞地球做橢圓形移動");
		} else {
			System.out.println("人造衛星無法進入太空");
		}
	}

	@Test
	public void ex1() {
		System.out.print("請輸入整數:");
		int number = sc.nextInt();
		System.out.print("輸入是");
		if (number == 0) {
			System.out.println("0");
		} else if (number % 2 == 0) {
			System.out.println("偶數");
		} else {
			System.out.println("奇數");
		}
	}

	@Test
	public void ex2() {
		System.out.print("請輸入3個整數(數字間用空白分開):");
		String input = sc.nextLine();
		int[] list = new int[3];
		int i = 0;
		for (String temp : input.split(" ")) {
			list[i] = Integer.valueOf(temp).intValue();
			i += 1;
		}
		Arrays.sort(list);
		System.out.print("大到小分別是 ");
		for (int j = list.length-1; j >=0 ; j--) {
			System.out.print(list[j]+", ");
		}
	}

	@Test
	public void ex3() {
		System.out.print("請輸入座標(數字間用空白分開):");
		String input = sc.nextLine();
		int[] list = new int[3];
		int i = 0;
		for (String temp : input.split(" ")) {
			list[i] = Integer.valueOf(temp).intValue();
			i += 1;
		}
		double len = Math.sqrt(Math.pow(list[0], 2)+Math.pow(list[1], 2));
		if (len < 20) {
			System.out.println("在圓內");
		} else {
			System.out.println("在圓外");
		}
	}

	@Test
	public void ex4() {
		System.out.print("請工作時數:");
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
		System.out.println("本週薪資:"+hours*basic);
	}

	@Test
	public void ex5() {
		System.out.print("今天是星期日，請輸入天數:");
		int days = sc.nextInt();
		System.out.print(days+"天後是星期");
		switch (days%7) {
		case 0:
			System.out.println("日");
			break;
		case 1:
			System.out.println("一");
			break;
		case 2:
			System.out.println("二");
			break;
		case 3:
			System.out.println("三");
			break;
		case 4:
			System.out.println("四");
			break;
		case 5:
			System.out.println("五");
			break;
		case 6:
			System.out.println("六");
			break;
		}
	}

	@Test
	public void ex7() {
		System.out.print("請輸入身高(cm):");
		int height = sc.nextInt();
		if (height>=200) {
			System.out.println("這是中鋒人選");
		} else if (height>=192) {
			System.out.println("這是前鋒人選");
		} else {
			System.out.println("這是後衛人選");
		}
	}
}
