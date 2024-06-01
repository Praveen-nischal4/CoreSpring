package com.cdac.CoreSpring.setterdi;

import com.cdac.CoreSpring.constructordi.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cdac/CoreSpring/setterdi/config.xml");
		
     Customer c = context.getBean("c1",Customer.class);
       
     System.out.println(c);
     
     
     Customer c4 = (Customer)context.getBean("c2");
     System.out.println(c4);
     
     Customer c5 = context.getBean("c3",Customer.class);
     System.out.println(c5);
     
     Customer c6 = context.getBean("c4",Customer.class);
     System.out.println(c6);
     
	}

	

}
