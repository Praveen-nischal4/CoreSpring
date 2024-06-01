package com.cdac.CoreSpring.setterdi;

public class Customer {
	
	private int custid;
	private String cname;
	private String address;
	
	private Product product;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", cname=" + cname + ", address=" + address + ", product=" + product
				+ "]";
	}
	public Customer() {
	}
	
	

}
