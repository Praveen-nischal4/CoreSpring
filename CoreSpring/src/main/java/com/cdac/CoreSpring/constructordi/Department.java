package com.cdac.CoreSpring.constructordi;

public class Department {

	private int deptid;
	private String manager;
	
	public Department() {
		super();
	}

	public Department(int deptid, String manager) {
		super();
		this.deptid = deptid;
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", manager=" + manager + "]";
	}
	
	
	
}
