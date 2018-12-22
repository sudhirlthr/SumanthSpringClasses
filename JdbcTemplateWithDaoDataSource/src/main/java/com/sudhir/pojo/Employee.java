/**
 * 
 */
package com.sudhir.pojo;

import org.springframework.stereotype.Repository;

/**
 * @author sudhir
 *
 */
@Repository
public class Employee {
/*	@Autowired
	public Employee( String name, String job, Integer salary, String designation, String gender) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.designation = designation;
		this.gender = gender;
	}
	*/
	
	
	private Integer eno;
	private String name;
	private String job;
	private Integer salary;
	private String designation;
	private String gender;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
