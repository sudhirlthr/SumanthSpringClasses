package com.sudhir.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("db.properties")
public class DataSource {
	
	@Autowired
	private Environment environment;
	
	private String driiverClass;
	private String url;
	private String username;
	private String password;
	
	public String getDriiverClass() {
		return driiverClass;
	}
	public void setDriiverClass(String driiverClass) {
		this.driiverClass = driiverClass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	
	public void disp() {
		System.out.println(environment.getProperty("db.driverClass"));
		System.out.println("driverClass=" + environment.getProperty("db.driverClass")
		+ ", url=" + environment.getProperty("db.url") + 
		", username=" + environment.getProperty("db.username") + 
		", password="+ environment.getProperty("db.password"));
	}
}
