package com.sudhir.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("db.properties")
public class DataSourceImpl {
	
	public DataSourceImpl() {
		System.out.println("DataSourceImpl object is created");
	}
	
	@Autowired
	private Environment environment;
	
	public DataSource dataSource(){
		return new DriverManagerDataSource(environment.getProperty("db.driverClass"),
				environment.getProperty("db.url"), environment.getProperty("db.username"), environment.getProperty("db.password"));
		//return new DriverManagerDataSource("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/springdb", "postgres", "123456");
	}
}
