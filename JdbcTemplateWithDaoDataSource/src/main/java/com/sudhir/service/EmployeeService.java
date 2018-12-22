package com.sudhir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhir.dao.EmployeeDao;
import com.sudhir.pojo.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public int saveEmployeeData(Employee employee) {
		return employeeDao.save(employee);
	}
}
