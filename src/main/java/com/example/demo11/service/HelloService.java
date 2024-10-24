package com.example.demo11.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo11.entity.mealEntity;
import com.example.demo11.mapper.HelloMapper;

@Service
public class HelloService {
	// JPA
//	@Autowired
//	private HelloRepository helloRepository;

	@Autowired
	private HelloMapper helloMapper;

	/**
	 * 新增資料
	 * 
	 * @throws Exception
	 */
	@Transactional
	public void insertTest(String name, int price) throws Exception {
		if (StringUtils.isBlank(name)) {
			throw new Exception("name不可為空");
		}

		// JPA
//		HelloInterface.insert("名稱測試", 123);
//		HelloInterface.save(voMeal);

		// mybatis
		mealEntity voMeal = new mealEntity();
		voMeal.setName(name);
		voMeal.setPrice(price);
		helloMapper.insertTest(voMeal);

	}

	/**
	 * 查詢資料by id
	 * 
	 * @return
	 */
	public List<mealEntity> findTestById(int id) {
		// Mybatis
		mealEntity voMeal = new mealEntity();
		voMeal.setId(id);
		return helloMapper.findTestById(voMeal);
	}

	/**
	 * 查詢資料All
	 * 
	 * @return
	 */
	public List<mealEntity> findTestAll() {
		// JPA
//		return helloRepository.findAll();

		// Mybatis
		return helloMapper.findTestAll();
	}

	/**
	 * 更新資料
	 */
	public void updataTest(int id, String name, int price) {
		// JPA
//		mealEntity voMeal = new mealEntity();
//		voMeal.setName("修改測試");
//		voMeal.setPrice(123);
//		helloRepository.update("修改測試", 123);

		// Mybatis
		mealEntity voMeal = new mealEntity();
		voMeal.setId(id);
		voMeal.setName(name);
		voMeal.setPrice(price);
		helloMapper.updataTest(voMeal);
	}

	/**
	 * 刪除資料
	 */
	public void deleteTest(int id) {
		// JPA
//		mealEntity voMeal = new mealEntity();
//		voMeal.setName("修改測試");
//		helloRepository.delete(voMeal);

		// Mybatis
		mealEntity voMeal = new mealEntity();
		voMeal.setId(id);
		helloMapper.deleteTest(voMeal);
	}
}
