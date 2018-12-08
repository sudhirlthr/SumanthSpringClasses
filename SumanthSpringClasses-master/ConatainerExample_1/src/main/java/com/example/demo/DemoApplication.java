package com.example.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		beanDefinitionReader.loadBeanDefinitions("spring-core.xml");
		
		// untill unless object has been called by getBeans() method of BeanFactory implemented class, Object will not get created
		Person person = beanFactory.getBean(Person.class);
		System.out.println(person.toString());
		
		//using ClassPathResource
		// It always create object even without calling getBeans() method 
		ApplicationContext claasPathapplicationContext = new ClassPathXmlApplicationContext("spring-core.xml");
		/*Person person2 = claasPathapplicationContext.getBean(Person.class);
		System.out.println(person2.toString());*/
		
		// Using FileSystemResources, in this scenario also  PErson Object will get created
		ApplicationContext fileSystemApplicationContext = new FileSystemXmlApplicationContext("/src/main/resources/spring-core.xml");
		/*Person peroson3 = fileSystemApplicationContext.getBean(Person.class);
		System.out.println(peroson3.toString());*/
	}
}
