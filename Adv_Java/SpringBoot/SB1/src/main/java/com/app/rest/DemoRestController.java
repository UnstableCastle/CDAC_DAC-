package com.app.rest;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/dateTime")
	public String getDateTime() {
		return LocalDate.now().toString();
	}
	
	@GetMapping("/hello/{id}")	
		public String getId(@PathVariable int id) {
		return "ID = "+ id;
	}
	
	
}
