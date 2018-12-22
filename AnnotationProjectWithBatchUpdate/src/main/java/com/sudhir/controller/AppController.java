package com.sudhir.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.sudhir.pojo.Student;
import com.sudhir.services.StudentService;

@Configuration
public class AppController {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext("com.sudhir");
		StudentService studentService = container.getBean(StudentService.class);
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Mona","Information Tech","08001IT2012228"));
		studentList.add(new Student("Surbhi","Information Security","07001IS2012228"));
		studentList.add(new Student("Akanksha","Computer Engineering","14001CE2012228"));
		studentList.add(new Student("Gauri","Aeronautical","9001AE2012228"));
		studentList.add(new Student("Anisha","Civil","9001CV2012228"));
		System.out.println("Number of Student record inserted = "+Arrays.toString(studentService.saveStudentBatchData(studentList)));
	}

}
