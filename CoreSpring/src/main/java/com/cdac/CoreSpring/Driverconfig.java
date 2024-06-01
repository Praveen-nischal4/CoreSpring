package com.cdac.CoreSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Driverconfig {

	@Bean(name = "defaultDriver")
    public Driver getDefaultDriver() {
        Driver d = new Driver();
        d.setDrivername("com.mysql.cj.jdbc.Driver");
        d.setUsername("root");
        d.setPassword("root");
        d.setUrl("jdbc:mysql://localhost:3306/test");
        return d;
    }
	
	
	 @Bean(name = "first" ,initMethod = "start",destroyMethod = "end")
	    @Primary
	    public Driver getFirstDriver() {
	        Driver dd = new Driver();
	        dd.setDrivername("com.oracle.jdbc.Driver");
	        dd.setUsername("admin");
	        dd.setPassword("admin");
	        dd.setUrl("jdbc:oracle://localhost:1521/test");
	        return dd;
	    }
	 
	 
	 @Bean(name = "second")
	    public Driver getSecondDriver() {
	        Driver dd = new Driver();
	        dd.setDrivername("com.sqlserver.jdbc.Driver");
	        dd.setUsername("sa");
	        dd.setPassword("password");
	        dd.setUrl("jdbc:sqlserver://localhost:1433;databaseName=testdb");
	        return dd;
	    }
	
	
	
	
}
