/**
 * 
 */
package com.sudhir.pojo;

/**
 * @author sudhir
 *
 */
public class Student {
	private String name;
	private String branch;
	private String rollNo;
	public Student(String name, String branch, String rollNo) {
		this.name = name;
		this.branch = branch;
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public String getBramch() {
		return branch;
	}
	/*public void setBramch(String branch) {
		this.branch = branch;
	}*/
	public String getRollNo() {
		return rollNo;
	}
	/*public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}*/
	
}
