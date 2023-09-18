package com.student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.demo.dao.StudentRepository;
import com.student.demo.model.Student;

@Service
public class StudentServiceimpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public boolean saveStudent(Student student) {
			try {
				Student s = studentRepository.save(student);
				
				if(s != null) {
					return true;
				}
					
				else {
					return false;
				}
					
			}
			catch(Exception e){
				
			}
			
			return false;
	}
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
		
}
