/**
 * 
 */
package com.sudhir.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudhir.dao.StudentDao;
import com.sudhir.pojo.Student;

/**
 * @author sudhir
 *
 */
@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
	public int[] saveStudentBatchData(List<Student> studentList) {
		return studentDao.saveStudentBatchData(studentList);
	}
}
