package com.student.demo.model;

import jakarta.persistence.Column;
//import javax.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(schema ="students" ,name="student")
public class Student {
	
	@Id
	@GeneratedValue()
	@Column(name="id")
	private Integer id;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="std")
	private String std;
	
	@Column(name = "marks")
	private Integer marks;
	
	public Student() {
//		super();
	}
	
	public Student(Integer id, String sname, String std, Integer marks) {
		super();
		this.id = id;
		this.sname = sname;
		this.std = std;
		this.marks = marks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
}
