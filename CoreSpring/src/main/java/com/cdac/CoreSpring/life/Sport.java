package com.cdac.CoreSpring.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sport implements InitializingBean,DisposableBean{
	
	String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sport [name=" + name + "]";
	}

	public void destroy() throws Exception {

     System.out.println("Sports bean destroyed");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Sports bean created");
		
	}

}
