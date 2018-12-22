/**
 * 
 */
package com.sudhir.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.sudhir.pojo.Student;

/**
 * @author sudhir
 *
 */
@Repository
public class StudentDao extends JdbcDaoSupport {
	
	@Autowired
	public StudentDao(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	public int[] saveStudentBatchData(List<Student> studentList) {
		String query = "insert into student values (?,?,?)";
		int[] batchUpdate = this.getJdbcTemplate().batchUpdate(query, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Student student = studentList.get(i);
				ps.setString(1, student.getName());
				ps.setString(2, student.getBramch());
				ps.setString(3, student.getRollNo());
			}
			
			@Override
			public int getBatchSize() {
				return studentList.size();
			}
		});
		return batchUpdate;
	}
}
