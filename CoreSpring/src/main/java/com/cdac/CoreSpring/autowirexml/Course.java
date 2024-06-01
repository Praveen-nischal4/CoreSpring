package com.cdac.CoreSpring.autowirexml;

public class Course {

	String name;
	String duration;
	Instructor instructor;                     //search object name bean 'instructor' here in this case
	
	public Course()
	{
		
	}
    
	
	public Course(Instructor inst) {
		this.instructor = inst;
	}

    
	public Course(String name, String duration, Instructor inst) {
		super();
		this.name = name;
		this.duration = duration;
		this.instructor = inst;
	}


	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", instructor=" + instructor + "]";
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Instructor getInst() {
		return instructor;
	}

	public void setInst(Instructor instructor) {
		this.instructor = instructor;
	}	
	
}
