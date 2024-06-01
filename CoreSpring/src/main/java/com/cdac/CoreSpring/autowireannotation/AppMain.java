package com.cdac.CoreSpring.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cdac/CoreSpring/autowireannotation/myconfig.xml");
		Course c = (Course)context.getBean("course");
		System.out.println(c);
	}

}
