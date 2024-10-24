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
	 * �s�W���
	 * 
	 * @throws Exception
	 */
	@Transactional
	public void insertTest(String name, int price) throws Exception {
		if (StringUtils.isBlank(name)) {
			throw new Exception("name���i����");
		}

		// JPA
//		HelloInterface.insert("�W�ٴ���", 123);
//		HelloInterface.save(voMeal);

		// mybatis
		mealEntity voMeal = new mealEntity();
		voMeal.setName(name);
		voMeal.setPrice(price);
		helloMapper.insertTest(voMeal);

	}

	/**
	 * �d�߸��by id
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
	 * �d�߸��All
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
	 * ��s���
	 */
	public void updataTest(int id, String name, int price) {
		// JPA
//		mealEntity voMeal = new mealEntity();
//		voMeal.setName("�ק����");
//		voMeal.setPrice(123);
//		helloRepository.update("�ק����", 123);

		// Mybatis
		mealEntity voMeal = new mealEntity();
		voMeal.setId(id);
		voMeal.setName(name);
		voMeal.setPrice(price);
		helloMapper.updataTest(voMeal);
	}

	/**
	 * �R�����
	 */
	public void deleteTest(int id) {
		// JPA
//		mealEntity voMeal = new mealEntity();
//		voMeal.setName("�ק����");
//		helloRepository.delete(voMeal);

		// Mybatis
		mealEntity voMeal = new mealEntity();
		voMeal.setId(id);
		helloMapper.deleteTest(voMeal);
	}
}
