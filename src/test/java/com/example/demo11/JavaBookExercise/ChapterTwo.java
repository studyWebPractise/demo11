package com.example.demo11.JavaBookExercise;

import org.junit.jupiter.api.Test;

public class ChapterTwo {

	@Test
	public void ex1() {
		System.out.println("�ڷRjava");
		System.out.println("java�O�@�ӥ\��j�j���{���y��");
	}
	
	@Test
	public void ex2() {
		System.out.println("����");
		System.out.println("�ᶡ�@���s�A");
		System.out.println("�W�u�L���ˡF");
		System.out.println("�|�M�ܩ���A");
		System.out.println("��v���T�H�C");
	}
	@Test
	public void ex3() {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i*2; j++) {
				System.out.print("a");
			}
			System.out.println();
		}
	}
}
