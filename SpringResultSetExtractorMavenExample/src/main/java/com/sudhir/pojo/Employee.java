/**
 * 
 */
package com.sudhir.pojo;

/**
 * @author sudhir
 *
 */
public class Employee {
	private Integer eno;
	private String eName;
	private String job;
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", eName=" + eName + ", job=" + job + ", salary=" + salary + ", desg=" + desg
				+ ", gender=" + gender + "]";
	}
	private Double salary;
	private String desg;
	private String gender;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	} 
}
