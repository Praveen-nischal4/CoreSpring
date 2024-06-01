package com.cdac.CoreSpring.constructordi;

public class Employee {

	private int empid;
	private String ename;
	private double salary;
    private Department dept;
    
	public Employee(int empid, String ename, double salary, Department dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
