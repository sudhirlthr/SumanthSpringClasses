package com.sudhir.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("com.sudhir");
		PersonFactory personFactory = container.getBean(PersonFactory.class);
		Person person = personFactory.createPerson();
		System.out.println(person);
		
		Person person2 = personFactory.createPerson();
		System.out.println(person);
		container.close();
	}

}
