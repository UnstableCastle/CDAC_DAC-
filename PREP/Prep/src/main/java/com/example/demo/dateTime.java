package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dateTime {

	@GetMapping("/time")
	public String time() {
		return LocalDateTime.now().toString();
	}
	
}
