//this is our bean class

package com.cdac.CoreSpring;

public class Driver {
	
	private String username;
	private String password;
	private String url;
	private String drivername;
	
	@Override
	public String toString() {
		return "Driver [username=" + username + ", password=" + password + ", url=" + url + ", drivername=" + drivername
				+ "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	
	public void start()
	{
		System.out.println("Driver bean Created");
	}
	
	public void end()
	{
		System.out.println("Driver bean destroyed");
	}
	
}
