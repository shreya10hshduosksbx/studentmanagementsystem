package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Student;

//no need to add @repository because implementation class of jpa repo is simplejparepository and it has annotation @repostory.
//by default @transactional


public interface studentrepo extends JpaRepository<Student,Long> {

	

}
