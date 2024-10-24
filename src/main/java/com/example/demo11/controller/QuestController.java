package com.example.demo11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo11.service.HelloService;

@RestController
public class QuestController {
	@Autowired
	private HelloService helloService;
	
	@PostMapping("/hello2")
	public String hello() {
		return "HelloWorld";
	}
}
