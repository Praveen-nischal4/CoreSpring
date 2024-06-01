package com.cdac.CoreSpring.collectiondi;
import java.util.*;

public class Student {

	private String name;
	Map<String,String> course;
	List<String> phno;
	HashSet<String> address;
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", phno=" + phno + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public List<String> getPhno() {
		return phno;
	}
	public void setPhno(List<String> phno) {
		this.phno = phno;
	}
	public HashSet<String> getAddress() {
		return address;
	}
	public void setAddress(HashSet<String> address) {
		this.address = address;
	}
	
	
}
