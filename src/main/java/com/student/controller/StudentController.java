package com.student.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.entities.Student;
import com.student.repository.studentrepo;
import com.student.service.studentservice;

@Controller
public class StudentController {

	private studentservice studentservice;

	public StudentController(com.student.service.studentservice studentservice) {
		super();
		this.studentservice = studentservice;
	}

	Logger logger = LoggerFactory.getLogger(StudentController.class);

	// handler methods
	// get all students
	@GetMapping("/students")
	public String listStudents(Model model) {
		logger.info("[listStudents]");
		model.addAttribute("students", studentservice.getAllStudents());
		return "students";
	}

	// create new student
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		logger.info("[creating student] info message");
		// create student to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentservice.saveStudent(student);
		return "redirect:/students";

	}

	// update method
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentservice.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

		// get student from database by id
		logger.warn("[updateStudent] Updating Student");
		Student existingStudent = studentservice.getStudentById(id);

		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());

		// save updates
		studentservice.saveStudent(existingStudent);
		return "redirect:/students";

	}

	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		logger.warn("[deleteStudent] deleting Student");
		studentservice.deleteStudent(id);
		return "redirect:/students";
	}

}
