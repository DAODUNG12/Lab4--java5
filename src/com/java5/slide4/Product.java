package com.java5.slide4;

import java.sql.Date;

public class Product {
	private String name;
	private Double unitPrice;
	private Double discount;

	public Product(String name, Double unitPrice, Double discount) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
	}

	public Double getnewPrice() {
		return unitPrice * (1000.0 - discount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

}
