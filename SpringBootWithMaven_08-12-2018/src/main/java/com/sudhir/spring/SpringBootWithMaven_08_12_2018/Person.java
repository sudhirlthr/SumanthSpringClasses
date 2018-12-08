package com.sudhir.spring.SpringBootWithMaven_08_12_2018;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person {

	@Value("104")
	private Integer E_Id;
	@Value("ANIl")
	private String Name;
	@Value("100000")
	private Double Salary;

	public Person() {
		System.out.println("Person object is created");
	}

	public Integer getE_Id() {
		return E_Id;
	}

	public void setE_Id(Integer e_Id) {
		E_Id = e_Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Person [E_Id=" + E_Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

}
