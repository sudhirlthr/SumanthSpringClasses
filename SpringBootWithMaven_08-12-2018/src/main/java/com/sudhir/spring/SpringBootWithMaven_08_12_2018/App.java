package com.sudhir.spring.SpringBootWithMaven_08_12_2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(App.class, args);
		Person person = container.getBean(Person.class);
		System.out.println(person);
		
		Person person2 = container.getBean(Person.class);
		person2.setE_Id(500);
		person2.setName("Deepika");
		person2.setSalary(20000.0);
		System.out.println(person2);
		container.close();
		
	}
}
