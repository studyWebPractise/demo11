package com.example.demo11;

public interface MyInterface {

	// ���ĪG�۵�
	public static final int NUMBER = 10;
	int A = 100;

	public void fly();

	public default void fly(String name) {
		System.out.println(name + "�b���F");
	}
	
	// ����B�ߤ@ => ��������@ -> �]�����i�H���s�w�q
	public static void fly2(String name) {
		System.out.println(name + "�b���@�ɭ�");
	}
	
}
