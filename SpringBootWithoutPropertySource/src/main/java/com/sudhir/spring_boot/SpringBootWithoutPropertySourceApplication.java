package com.sudhir.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootWithoutPropertySourceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootWithoutPropertySourceApplication.class, args);
			
		DataSourceFactory dataSourceFactory = container.getBean(DataSourceFactory.class);
		System.out.println(dataSourceFactory);
	}

}

