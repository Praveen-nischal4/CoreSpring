package com.cdac.CoreSpring.life;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {

     AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cdac/CoreSpring/life/thisConfig.xml");
     
     context.registerShutdownHook();
     Item i = (Item)context.getBean("item1");
     System.out.println(i);
     
     Sport s = (Sport)context.getBean("sp");
     System.out.println(s);
	}

}
