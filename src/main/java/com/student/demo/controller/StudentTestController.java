package com.student.demo.controller;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.model.Student;
import com.student.demo.service.StudentServiceimpl;

//@CrossOrigin(origins = "http://127.0.0.1:5500")
@CrossOrigin
@RestController
public class StudentTestController {
	
	@Autowired
	private StudentServiceimpl studentServiceImpl;
//	private StudentRepository repository;
	
	
//	@PostMapping("saveStudent")
	@RequestMapping(value="saveStudent", method= RequestMethod.POST)
	public ResponseEntity<String> saveAll(@RequestBody Student student) {
//			repository.save(student);
//			return "Saved in Database";
		
		if(studentServiceImpl.saveStudent(student)) {
			return new ResponseEntity<>("Data Saved" , HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Data Not Saved" , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping(value="getAllStudents", method= RequestMethod.GET)
//	@GetMapping("getAllStudents")
	public ResponseEntity<List<Student>> getAll(){
		return new ResponseEntity<>(studentServiceImpl.getAllStudent(),HttpStatus.OK);
	}
}
