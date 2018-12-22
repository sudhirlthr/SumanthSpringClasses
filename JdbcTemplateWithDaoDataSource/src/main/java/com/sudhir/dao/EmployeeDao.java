package com.sudhir.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.sudhir.pojo.Employee;

@Repository	
public class EmployeeDao extends JdbcDaoSupport{
	
	@Autowired
	public EmployeeDao(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	public int save(Employee employee) {
		return getJdbcTemplate().update("insert into emp values(default,?,?,?,?,?)", 
									employee.getName(),employee.getJob(), employee.getSalary(),
									employee.getDesignation(), employee.getGender());
	}
}
