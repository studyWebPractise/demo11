package com.example.demo11;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo11.service.HelloService;

@WebAppConfiguration
@SpringBootTest
@Transactional
public class projectTest {
	@Autowired
	private HelloService helloService;

	@Test
	public void insertTest() throws Exception {
		helloService.insertTest("新增測試", 123);
		System.out.println(helloService.findTestAll());
	}

	@Test
	public void findTestById() {
		System.out.println(helloService.findTestById(1));
	}

	@Test
	public void findTestAll() {
		System.out.println(helloService.findTestAll());
	}

	@Test
	public void updataTest() {
		helloService.updataTest(1,"新增測試", 456);
//		System.out.println(helloService.findTestAll());
	}

	@Test
	public void deleteTest() {
		helloService.deleteTest(1);
	}
}
