package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {

	@Test
	public void test() {
		// ゑ癸も诀腹絏Α 计4絏-计3絏-计3絏
		// \d计ヴ種
		// ボ呼オ弊絬常
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		String pattern1 = "\\d{4}-\\d{3}-\\d{3}";
		String pattern2 = "\\d{4}(-\\d{3}){2}";
		Scanner sc = new Scanner(System.in);
		System.out.print("叫块も诀腹絏(Α->计4絏-计3絏-计3絏):");
		String input = sc.nextLine();
		if (input.matches(pattern)) {
			System.out.println(input + "才も诀腹絏Α");
		} else {
			System.out.println(input + "ぃ才も诀腹絏Α");
		}
	}

	@Test
	public void test1() {
		// ゑ癸カ杠 Α 计2絏-计7絏 || (计2絏)-计7絏
		String pattern = "\\d{2}-\\d{7}";
		String pattern1 = "\\(\\d{2}\\)-\\d{7}";
		String pattern3 = "(\\(\\d{2}\\)|\\d{2})-\\d{7}";
		Scanner sc = new Scanner(System.in);
		System.out.print("叫块も诀腹絏(Α->计2絏-计7絏):");
		String input = sc.next();
		if (input.matches(pattern3)) {
			System.out.println(input + "才カ杠Α");
		} else {
			System.out.println(input + "ぃ才カ杠Α");
		}
	}

	@Test
	public void test2() {
		// ゑ癸カ杠 Α 计2絏-计7絏 || 计2絏-计8絏
//		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// {a,b} ぶ瞷aΩ 瞷bΩ
		String pattern = "(\\(\\d{2}\\)|\\d{2})-\\d{7,8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("叫块カ杠(Α->计2絏-计7絏):");
		String input = sc.next();
		if (input.matches(pattern)) {
			System.out.println(input + "才カ杠Α");
		} else {
			System.out.println(input + "ぃ才カ杠Α");
		}
	}

	@Test
	public void test3() {
		// ゑ癸カ杠 Α 计2絏-计7絏 || 计2絏-计8絏
		String pattern = "0\\d{1,3}-\\d{7,8}";
		// {a,b} ぶ瞷aΩ 瞷bΩ
//		String pattern = "(\\(\\d{2}\\)|\\d{2})-\\d{7,8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("叫块カ杠(Α->计2絏-计7絏):");
		String input = sc.next();
		if (input.matches(pattern)) {
			System.out.println(input + "才カ杠Α");
		} else {
			System.out.println(input + "ぃ才カ杠Α");
		}
	}

	@Test
	public void test4() {
		// ゑ癸カ杠 Α 计2絏-计7絏 || 计2絏-计8絏
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		// {a,b} ぶ瞷aΩ 瞷bΩ
//		String pattern = "(\\(\\d{2}\\)|\\d{2})-\\d{7,8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("叫块カ杠(Α->计2絏-计7絏):");
		String input = sc.next();
		if (input.matches(pattern)) {
			System.out.println(input + "才カ杠Α");
		} else {
			System.out.println(input + "ぃ才カ杠Α");
		}
	}

	@Test
	public void test5() {
		// ゑ癸カ杠 Α 计2絏-计7絏 || 计2絏-计8絏
		String pattern = "[A-Za-z][1-2]\\d{8}";
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
		String pattern2 = "[\\w&&[^ABDEFHabdefh0-9_]][1-2]\\d{8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("叫块ōだ靡腹:");
		String input = sc.next();
		if (input.matches(pattern2)) {
			System.out.println(input + "才ōだ靡腹Α");
		} else {
			System.out.println(input + "ぃ才ōだ靡腹Α");
		}
	}
}
