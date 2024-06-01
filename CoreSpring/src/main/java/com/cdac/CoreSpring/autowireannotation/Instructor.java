package com.cdac.CoreSpring.autowireannotation;

public class Instructor {

	String name;
	String expertise;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", expertise=" + expertise + "]";
	}
	
	
}
