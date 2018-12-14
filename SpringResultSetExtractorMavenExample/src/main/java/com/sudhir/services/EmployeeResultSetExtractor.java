/**
 * 
 */
package com.sudhir.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sudhir.pojo.Employee;

/**
 * @author sudhir
 *
 */
public class EmployeeResultSetExtractor implements ResultSetExtractor {

	@Override
	public List<Employee> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
		List<Employee> empList = new ArrayList<>();
		while(resultSet.next()) {
			Employee employee = new Employee();
			employee.setEno(resultSet.getInt("eno"));
			employee.seteName(resultSet.getString("ename"));
			employee.setJob(resultSet.getString("job"));
			employee.setSalary(resultSet.getDouble("salary"));
			employee.setDesg(resultSet.getString("desg"));
			employee.setGender(resultSet.getString("gender"));
			empList.add(employee);
		}
		return empList;
	}

}
