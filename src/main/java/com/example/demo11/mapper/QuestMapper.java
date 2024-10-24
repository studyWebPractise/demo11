package com.example.demo11.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo11.entity.mealEntity;

@Mapper
public interface QuestMapper {
	/**
	 * 新增資料
	 * 
	 * @param voMeal
	 */
	public void insertTest(mealEntity voMeal);
}
