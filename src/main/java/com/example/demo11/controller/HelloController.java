package com.example.demo11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo11.entity.mealEntity;
import com.example.demo11.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;

	@PostMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}

	@PostMapping("/insertTest")
	public void insertTest(@RequestBody mealEntity voMeal) throws Exception {

		helloService.insertTest(voMeal.getName(), voMeal.getPrice());
	}

	@PostMapping("/findTestById")
	public List<mealEntity> findTestById(@RequestBody mealEntity voMeal) {
		return helloService.findTestById(voMeal.getId());

	}

	@PostMapping("/findTestAll")
	public List<mealEntity> findTestAll() {
		return helloService.findTestAll();

	}

	@PostMapping("/updataTest")
	public void updataTest(@RequestBody mealEntity voMeal) {
		helloService.updataTest(voMeal.getId(), voMeal.getName(), voMeal.getPrice());
	}

	@PostMapping("/deleteTest")
	public void deleteTest(@RequestBody mealEntity voMeal) {
		helloService.deleteTest(voMeal.getId());
	}
}
