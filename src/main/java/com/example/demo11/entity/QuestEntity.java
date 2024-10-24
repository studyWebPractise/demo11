package com.example.demo11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quest")
public class QuestEntity {
	
	@Id
	@Column(name = "name", nullable = false, length = 100)
	String questId;

	@Column(name = "price")
	int price;
}
