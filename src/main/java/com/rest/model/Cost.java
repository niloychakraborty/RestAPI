package com.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="cost")
public class Cost {
    @Id
	private double productId;
    @Field(value="cost")
	private double cost;
    @Field(value="currencyCode")
	private String currencyCode;
	
	public Cost() {
		super();
	}
	public Cost(double productId, double cost,String currencyCode) {
		super();
		this.productId = productId;
		this.cost = cost;
		this.currencyCode = currencyCode;
	}
	public double getProductId() {
		return productId;
	}
	public void setProductId(double productId) {
		this.productId = productId;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
