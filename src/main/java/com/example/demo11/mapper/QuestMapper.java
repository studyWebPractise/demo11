package com.example.demo11.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo11.entity.mealEntity;

@Mapper
public interface QuestMapper {
	/**
	 * �s�W���
	 * 
	 * @param voMeal
	 */
	public void insertTest(mealEntity voMeal);
}
