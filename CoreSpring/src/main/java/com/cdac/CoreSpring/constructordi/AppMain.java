package com.cdac.CoreSpring.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("com/cdac/CoreSpring/constructordi/constructorconfig.xml");
		 
		Employee e = context.getBean("emp1",Employee.class);
		System.out.println(e);
		
		Employee e1 = (Employee)context.getBean("emp2");
		System.out.println(e1);
	}

}
