/**
 * 
 */
package com.sudhir.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

/**
 * @author sudhir
 *
 */
@Repository
@PropertySource("application.properties")
public class DataSourceFactory {
	
	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(environment.getProperty("db.driverClassName"));
		driverManagerDataSource.setUrl(environment.getProperty("db.url"));
		driverManagerDataSource.setUsername(environment.getProperty("db.username"));
		driverManagerDataSource.setPassword(environment.getProperty("db.password"));
		return driverManagerDataSource;
	}
}
