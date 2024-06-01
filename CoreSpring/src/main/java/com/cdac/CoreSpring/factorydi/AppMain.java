package com.cdac.CoreSpring.factorydi;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppMain {

	public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("com/cdac/CoreSpring/factorydi/factoryconfig.xml");

	
		
    Product p11 =context.getBean("f1",Product.class);
	System.out.println(p11);
    
    Product p =context.getBean("p1",Product.class);
        		System.out.println(p);
        		
        		 Product p2 =context.getBean("p1",Product.class);
         		System.out.println(p2);
	}

}
