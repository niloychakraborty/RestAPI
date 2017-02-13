package com.rest.model.outbound;

public class ProductOutBound {

	private double id;
	private String name;
	private CostOutBound current_price;
	
	public ProductOutBound(double id, String name, CostOutBound current_price) {
		super();
		this.id = id;
		this.name = name;
		this.current_price = current_price;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CostOutBound getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(CostOutBound current_price) {
		this.current_price = current_price;
	}

	public ProductOutBound() {
		super();
	}

	

}
