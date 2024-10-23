package com.example.demo11;

public interface MyInterface {

	// 兩行效果相等
	public static final int NUMBER = 10;
	int A = 100;

	public void fly();

	public default void fly(String name) {
		System.out.println(name + "在飛了");
	}
	
	// 全域且唯一 => 必須有實作 -> 因為不可以重新定義
	public static void fly2(String name) {
		System.out.println(name + "在全世界飛");
	}
	
}
