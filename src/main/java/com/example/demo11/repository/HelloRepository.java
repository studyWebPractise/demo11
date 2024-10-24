package com.example.demo11.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo11.entity.mealEntity;

@Repository
public interface HelloRepository extends JpaRepository<mealEntity, String> {

//	@Modifying
//	@Transactional
//	@Query(value = "insert into meal.meal1(name,price) values(?1,?2)", nativeQuery = true)
//	public int insert(String name, int price);
//
//	@Query(value = "select * from meal.meal1", nativeQuery = true)
//	public List<mealEntity> findByCity();
	
	//如果更新後取出資料依舊是舊資料
	@Modifying(clearAutomatically=true)
	@Transactional
	@Query(value="update meal.meal1 set name = ?1, price =?2",nativeQuery=true)
	public int update (String name, int price);
}
