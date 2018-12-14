package com.sudhir.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sudhir.config.JdbcTemplateFactory;
import com.sudhir.pojo.Employee;

public class App {
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(JdbcTemplateFactory.class);
		JdbcTemplate jdbcTemplate = container.getBean(JdbcTemplate.class);
		
		// if want to retrieve all employee records
		List<Employee> emplList = (List<Employee>) jdbcTemplate.query("select * from emp", new EmployeeResultSetExtractor());
		for (Employee employee : emplList) {
			System.out.println(employee);
		}
		String query = "insert into emp(ename,job, salary,desg, gender) values(?,?,?,?,?)";
		String defaultEno = "default";
		String eName = "Seema";
		String job = "Soft Engg";
		Double salary = new Double(100000);
		String desg = "Engineer";
		String gender = "femail";
		if(jdbcTemplate.update(query,new Object[] {eName,job,salary,desg,gender})>0)
			System.out.println("Data inserted");
		else
			System.out.println("Some Issue, Data didn't inserted");
		System.out.println("****************** After insertion new record *****************");
		
		// if want to retrieve some of the employee records
		// Without ResultSetExtractor implementation class with Anonymous class
		List<Employee> employees = (List<Employee>) jdbcTemplate.query("select ename, job, salary from emp", new ResultSetExtractor() {
			
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> employees = new ArrayList<>();
				while(rs.next()) {
					Employee employee = new Employee();
					employee.seteName(rs.getString("ename"));
					employee.setJob(rs.getString("job"));
					employee.setSalary(rs.getDouble("salary"));
					employees.add(employee);
				}
				return employees;
			}
		});
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		container.close();
	}
}
