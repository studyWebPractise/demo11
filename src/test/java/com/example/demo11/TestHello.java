package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestHello {

	@Test
	public void testHello() { 
		//this㊣ぃfunction跑计┪function
		System.out.println(helloMasker("hello"));
		System.out.println(this.helloMasker1("0","1","2"));
		System.out.println(this.helloMasker1("0"));
	}
	
	public String helloMasker(String a) {
		return a+" 123";
	}
	
	public String helloMasker1(String ...a) {
		return a[0];
	}
	
	@Test
	public void staticTest() {
		//PIΤ本ststic(办跑计) final(ぃэ)
		System.out.println(Math.PI);
	}
	
	@Test
	public void variableTest() {
		char a = 'a';
		double b = 5;
		double c = 2;
		
		System.out.println(b/c);
	}
	
}
