package com.sudhir.util;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateImpl {

	@Autowired
	private DataSourceImpl dataSource;
	
	public JdbcTemplateImpl() {
		System.out.println("JdbcTemplateImpl has been created");
	}
	
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource.dataSource());
	}
}
