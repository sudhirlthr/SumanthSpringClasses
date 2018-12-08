package com.sudhir.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("com.sudhir");
		DataSource dataSource = container.getBean(DataSource.class);
		dataSource.disp();
	}

}
