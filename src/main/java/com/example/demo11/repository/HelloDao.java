package com.example.demo11.repository;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo11.entity.mealEntity;

@Mapper
public interface HelloDao {
	
	public void insertTest(mealEntity voMeal);
}
