package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec6Test {
	@Test
	public void bankMain() {
		Bank b = new Bank();
		b.setBankName("bank_name");
		b.setUserName("user_nmae");

		// �s��
		b.saving(10);
//		System.out.println(b.toString());

		// ����
		b.withdraw(10);
//		System.out.println(b.toString());

		// ���ڥ���
		b.withdraw(10010);
//		System.out.println(b.toString());

		// ���ڥ���
		b.withdraw(-10);
//		System.out.println(b.toString());

	}
}
