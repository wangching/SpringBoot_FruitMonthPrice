package com.cccs425.group5.fruitmonthpriceservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FruitMonthPrice {
	
	@Id
	private long id;
	
	@Column(name="fruit_fruit")
	private String fruit;
	
	@Column(name="fruit_month")
	private String month;
	
	private BigDecimal fmp;
	private String enviroment;
	
	public FruitMonthPrice() {
		super();
	}
	
	public FruitMonthPrice(long id, String fruit, String month, BigDecimal fmp) {
		super();
		this.id = id;
		this.fruit = fruit;
		this.month = month;
		this.fmp = fmp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public BigDecimal getFmp() {
		return fmp;
	}

	public void setFmp(BigDecimal fmp) {
		this.fmp = fmp;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}
	
	

}
