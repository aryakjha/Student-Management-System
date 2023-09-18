package com.student.demo.service;

import java.util.List;

import com.student.demo.model.Student;

public interface StudentService {

		boolean saveStudent(Student student);
		List<Student> getAllStudent();
}
