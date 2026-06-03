package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

@Controller
public class EmployeeController {
	

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {

		List<Employee> theEmployees = employeeService.findAll();
		

		theModel.addAttribute("employees", theEmployees);
		
		return "list-employee"; 
	}
}