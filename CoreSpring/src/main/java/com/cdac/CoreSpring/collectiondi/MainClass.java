package com.cdac.CoreSpring.collectiondi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cdac/CoreSpring/collectiondi/collectionconfig.xml");

		Student s = (Student)context.getBean("stu1");
		System.out.println(s);
		
	}

}
