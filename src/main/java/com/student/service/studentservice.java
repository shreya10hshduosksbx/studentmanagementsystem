package com.student.service;

import java.util.List;

import com.student.entities.Student;

public interface studentservice {

	List<Student> getAllStudents() ;
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Long id);
	
}
