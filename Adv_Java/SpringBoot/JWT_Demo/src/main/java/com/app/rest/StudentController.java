package com.app.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

List<Student> list = new ArrayList<>(List.of(
		
		new Student(1,"Navin","Java"),
		new Student(2,"Amaan","A"),
		new Student(3,"Priyanka","IOT"),
		new Student(4,"Rahul","BlockChain")		
		));

@GetMapping("/students")
public List<Student> getAllStudents(){
	return list;
	
}

@PostMapping("/students")
public void addStudent(@RequestBody Student theStudent) {
	list.add(theStudent);
}

@GetMapping("csrf-token")
public CsrfToken getCSRF(HttpServletRequest request) {
	return (CsrfToken) request.getAttribute("_csrf");

}
}

	