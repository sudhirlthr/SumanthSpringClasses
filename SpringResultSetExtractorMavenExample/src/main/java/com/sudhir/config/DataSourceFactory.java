package com.sudhir.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value="application.properties")
public class DataSourceFactory {

	@Autowired
	Environment environment;
	
	@Bean
	public DataSource dataSource() {
		return new DriverManagerDataSource(environment.getProperty("db.driverClass"),
											environment.getProperty("db.url"), 
											environment.getProperty("db.userName"),
											environment.getProperty("db.password"));
	}
}
