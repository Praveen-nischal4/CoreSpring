package com.cdac.CoreSpring.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Course {

	String name;
	String duration;
	
	@Autowired	
	@Qualifier("inst")
	Instructor instructor;
	public Course()
	{
		
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
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
}
