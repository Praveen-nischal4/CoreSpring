package com.cdac.CoreSpring.life;

public class Item {

	int price;
	String name;
	
	@Override
	public String toString() {
		return "Item [price=" + price + ", name=" + name + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void start()
	{
		System.out.println("Bean created");
	}
	
	
	public void end()
	{
		System.out.println("bean destroyed");
	}
}
