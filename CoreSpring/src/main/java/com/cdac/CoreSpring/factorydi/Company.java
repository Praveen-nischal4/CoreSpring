package com.cdac.CoreSpring.factorydi;

public class Company {

	public static Product getProduct(String name)
	{
		Product p = new Product();
		p.setProductid(1);
		p.setName(name);
		return p;
	}
}
