/**
 * 
 */
package com.sudhir.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author sudhir
 *
 */
@ComponentScan(basePackages= {"com.sudhir"})
@Configuration
public class JdbcTemplateFactory {
	
	@Autowired
	DataSource dataSource;
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
}
