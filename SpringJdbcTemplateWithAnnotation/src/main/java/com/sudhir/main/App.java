package com.sudhir.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sudhir.util.JdbcTemplateImpl;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("com.sudhir");
		JdbcTemplateImpl jdbcTemplateImpl = container.getBean(JdbcTemplateImpl.class);
		JdbcTemplate jdbcTemplate = jdbcTemplateImpl.jdbcTemplate();
		jdbcTemplate.update("insert into emp values (default, 'Namo','Politics',650000,'Politician','Mail')");
		System.out.println("Closing container");
		container.close();
	}
}
