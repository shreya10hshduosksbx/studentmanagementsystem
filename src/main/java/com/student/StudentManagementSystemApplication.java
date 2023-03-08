package com.student;



import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import com.student.entities.Student;
import com.student.repository.studentrepo;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class StudentManagementSystemApplication implements CommandLineRunner{//provides run method 

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private studentrepo studentrepo;
	
@Override
public void run(String... args) throws Exception {
//	
//	Student student1=new Student("Shreya","Kulkarni","shreya@gmail.com");
//	studentrepo.save(student1);
//	
//	Student student2=new Student("Shreyas","patil","shreyas@gmail.com");
//	studentrepo.save(student2);
//	
//	Student student3=new Student("Hirak","Jakhotiya","hirak@gmail.com");
//	studentrepo.save(student3);
	
}



}
