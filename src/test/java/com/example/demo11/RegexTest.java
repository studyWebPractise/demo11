package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {

	@Test
	public void test() {
		// ��������X�榡 �Ʀr4�X-�Ʀr3�X-�Ʀr3�X
		// \d��Ʀr���N�@��
		// ��ܺ��}���k�׽u���Y
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		String pattern1 = "\\d{4}-\\d{3}-\\d{3}";
		String pattern2 = "\\d{4}(-\\d{3}){2}";
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J������X(�榡->�Ʀr4�X-�Ʀr3�X-�Ʀr3�X):");
		String input = sc.nextLine();
		if (input.matches(pattern)) {
			System.out.println(input + "�ŦX������X�榡");
		} else {
			System.out.println(input + "���ŦX������X�榡");
		}
	}

	@Test
	public void test1() {
		// ��參�� �榡 �Ʀr2�X-�Ʀr7�X || (�Ʀr2�X)-�Ʀr7�X
		String pattern = "\\d{2}-\\d{7}";
		String pattern1 = "\\(\\d{2}\\)-\\d{7}";
		String pattern3 = "(\\(\\d{2}\\)|\\d{2})-\\d{7}";
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J������X(�榡->�Ʀr2�X-�Ʀr7�X):");
		String input = sc.next();
		if (input.matches(pattern3)) {
			System.out.println(input + "�ŦX���ܮ榡");
		} else {
			System.out.println(input + "���ŦX���ܮ榡");
		}
	}

	@Test
	public void test2() {
		// ��參�� �榡 �Ʀr2�X-�Ʀr7�X || �Ʀr2�X-�Ʀr8�X
//		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// {a,b} �ܤ֥X�{a�� �ܦh�X�{b��
		String pattern = "(\\(\\d{2}\\)|\\d{2})-\\d{7,8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J����(�榡->�Ʀr2�X-�Ʀr7�X):");
		String input = sc.next();
		if (input.matches(pattern)) {
			System.out.println(input + "�ŦX���ܮ榡");
		} else {
			System.out.println(input + "���ŦX���ܮ榡");
		}
	}

	@Test
	public void test3() {
		// ��參�� �榡 �Ʀr2�X-�Ʀr7�X || �Ʀr2�X-�Ʀr8�X
		String pattern = "0\\d{1,3}-\\d{7,8}";
		// {a,b} �ܤ֥X�{a�� �ܦh�X�{b��
//		String pattern = "(\\(\\d{2}\\)|\\d{2})-\\d{7,8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J����(�榡->�Ʀr2�X-�Ʀr7�X):");
		String input = sc.next();
		if (input.matches(pattern)) {
			System.out.println(input + "�ŦX���ܮ榡");
		} else {
			System.out.println(input + "���ŦX���ܮ榡");
		}
	}

	@Test
	public void test4() {
		// ��參�� �榡 �Ʀr2�X-�Ʀr7�X || �Ʀr2�X-�Ʀr8�X
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		// {a,b} �ܤ֥X�{a�� �ܦh�X�{b��
//		String pattern = "(\\(\\d{2}\\)|\\d{2})-\\d{7,8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J����(�榡->�Ʀr2�X-�Ʀr7�X):");
		String input = sc.next();
		if (input.matches(pattern)) {
			System.out.println(input + "�ŦX���ܮ榡");
		} else {
			System.out.println(input + "���ŦX���ܮ榡");
		}
	}

	@Test
	public void test5() {
		// ��參�� �榡 �Ʀr2�X-�Ʀr7�X || �Ʀr2�X-�Ʀr8�X
		String pattern = "[A-Za-z][1-2]\\d{8}";
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
		String pattern2 = "[\\w&&[^ABDEFHabdefh0-9_]][1-2]\\d{8}";
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J�����Ҧr��:");
		String input = sc.next();
		if (input.matches(pattern2)) {
			System.out.println(input + "�ŦX�����Ҧr���榡");
		} else {
			System.out.println(input + "���ŦX�����Ҧr���榡");
		}
	}
}
