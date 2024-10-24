package com.example.demo11.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo11.entity.mealEntity;

@Mapper
public interface HelloMapper {
	/**
	 * �s�W���
	 * 
	 * @param voMeal
	 */
	public void insertTest(mealEntity voMeal);

	/**
	 * �d�߸��by id
	 * 
	 * @param voMeal
	 */
	public List<mealEntity> findTestById(mealEntity voMeal);
	
	/**
	 * �d�߸��all
	 * 
	 * @param voMeal
	 */
	public List<mealEntity> findTestAll();

	/**
	 * ��s���
	 * 
	 * @param voMeal
	 */
	public void updataTest(mealEntity voMeal);

	/**
	 * �R�����
	 * 
	 * @param voMeal
	 */
	public void deleteTest(mealEntity voMeal);
}
