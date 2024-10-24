package com.example.demo11.service;

import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo11.entity.mealEntity;
import com.example.demo11.mapper.HelloMapper;

@Service
public class QuestService {
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
}
