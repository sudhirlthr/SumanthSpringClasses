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
		System.out.println("Number of Beans in Spring Boot = "+container.getBeanDefinitionCount());
		String[] beanDefinitionNames = container.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNames) {
			System.out.println("Bean Name = "+beanName);
		}
	}

}

