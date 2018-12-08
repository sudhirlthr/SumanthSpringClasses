package com.sudhir.database;

import org.springframework.beans.factory.annotation.Value;


public class Person {
	public Person(String name, String eid, String salary) {
		this.name= name;
		this.eId=eid;
		this.salary=salary;
	}
	public Person() {
		System.out.println("person object has been created");
	}
	@Value("Sudhir")
	private String name;
	@Value("125")
	private String eId;
	@Value("650000")
	private String salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", eId=" + eId + ", salary=" + salary + "]";
	}
	
}
