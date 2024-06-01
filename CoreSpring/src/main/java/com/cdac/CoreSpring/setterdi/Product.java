package com.cdac.CoreSpring.setterdi;

public class Product {

	private int prod_id;
	private String name;
	private int quantity;
	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
