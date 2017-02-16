package com.rest.model.outbound;

public class CostOutBound {

	private double cost;
	private String currencyCode;
	
	public CostOutBound() {
		super();
	}
	public CostOutBound( double d,String currencyCode) {
		super();
		this.cost = d;
		this.currencyCode = currencyCode;
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
