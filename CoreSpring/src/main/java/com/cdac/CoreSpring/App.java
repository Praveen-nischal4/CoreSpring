package com.cdac.CoreSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Driverconfig.class);
        context.registerShutdownHook();
        Driver defaultDriver = context.getBean("defaultDriver", Driver.class);
        System.out.println("Default Driver: " + defaultDriver);

        Driver firstDriver = context.getBean("first", Driver.class);
        System.out.println("First Driver: " + firstDriver);

        Driver secondDriver = context.getBean("second", Driver.class);
        System.out.println("Second Driver: " + secondDriver);
      
       Driver d = context.getBean(Driver.class);
       System.out.println(d);
    }
}
