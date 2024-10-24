package com.example.demo11.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo11.entity.mealEntity;

@Mapper
public interface HelloMapper {
	/**
	 * 新增資料
	 * 
	 * @param voMeal
	 */
	public void insertTest(mealEntity voMeal);

	/**
	 * 查詢資料by id
	 * 
	 * @param voMeal
	 */
	public List<mealEntity> findTestById(mealEntity voMeal);
	
	/**
	 * 查詢資料all
	 * 
	 * @param voMeal
	 */
	public List<mealEntity> findTestAll();

	/**
	 * 更新資料
	 * 
	 * @param voMeal
	 */
	public void updataTest(mealEntity voMeal);

	/**
	 * 刪除資料
	 * 
	 * @param voMeal
	 */
	public void deleteTest(mealEntity voMeal);
}
