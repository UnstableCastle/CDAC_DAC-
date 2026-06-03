package com.app.service;

import java.util.List;



import com.app.entity.Employee;


public interface EmployeeService {
	
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void saveEmployee(Employee theEMployee);
	public void deleteById(int theId);
	

}
