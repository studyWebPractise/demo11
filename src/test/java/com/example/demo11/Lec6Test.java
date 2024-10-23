package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec6Test {
	@Test
	public void bankMain() {
		Bank b = new Bank();
		b.setBankName("bank_name");
		b.setUserName("user_nmae");

		// 存款
		b.saving(10);
//		System.out.println(b.toString());

		// 提款
		b.withdraw(10);
//		System.out.println(b.toString());

		// 提款失敗
		b.withdraw(10010);
//		System.out.println(b.toString());

		// 提款失敗
		b.withdraw(-10);
//		System.out.println(b.toString());

	}
}
