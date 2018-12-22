/**
 * 
 */
package com.sudhir.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.sudhir.pojo.Employee;
import com.sudhir.service.EmployeeService;

/**
 * @author sudhir
 *
 */
@Configuration
public class App {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("com.sudhir");
		EmployeeService empService = container.getBean(EmployeeService.class);
		//Employee employee = new Employee("NYR", "DevOps",new Integer(50000),"ADmin","Male");
		Employee employee = new Employee();
		employee.setName("YTR");
		employee.setJob("DBA");
		employee.setSalary(20000);
		employee.setDesignation("DBA");
		employee.setGender("FeMale");
		System.out.println("Total number of employee record inserted = "+empService.saveEmployeeData(employee));
	}

}
