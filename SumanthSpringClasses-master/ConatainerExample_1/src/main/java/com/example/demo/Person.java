/**
 * 
 */
package com.example.demo;

/**
 * @author sudhir
 *
 */
public class Person {
	private Integer id;
	private String Ename;
	private Double salary;
	private String Address;
	
	
	
	public Person() {
		System.out.println("Person object is created");
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", Ename=" + Ename + ", salary=" + salary + ", Address=" + Address + "]";
	}
	
}
