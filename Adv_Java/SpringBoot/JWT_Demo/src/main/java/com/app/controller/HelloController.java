package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	
@GetMapping("/greet")
public String helloWorld(HttpServletRequest request) {
	
	
	
	return "Hello World   "+request.getSession().getId();
}
	
}
