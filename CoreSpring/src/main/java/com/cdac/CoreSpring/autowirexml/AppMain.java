package com.cdac.CoreSpring.autowirexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cdac/CoreSpring/autowirexml/config.xml");
		
		Course c = (Course)context.getBean("course1");
		System.out.println(c);
 
	}

}
