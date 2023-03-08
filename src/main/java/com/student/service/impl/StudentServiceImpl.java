package com.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.entities.Student;
import com.student.repository.studentrepo;
import com.student.service.studentservice;

@Service
public class StudentServiceImpl implements studentservice{

	//contructorbasedinjection
	private studentrepo studentrepo;
	
public StudentServiceImpl(com.student.repository.studentrepo studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}



//methods

	@Override
	public List<Student> getAllStudents() {
		
		return studentrepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
	
		return studentrepo.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		
		return studentrepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
	
		return studentrepo.save(student);
	}



	@Override
	public void deleteStudent(Long id) {
		
		studentrepo.deleteById(id);
	}


	
}
