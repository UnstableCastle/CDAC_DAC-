package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepository;
import com.app.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpli implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		 Optional<Employee> result = employeeRepository.findById(theId);
		 
		 Employee theEmployee = null;
		 if(result.isPresent()) {
			 theEmployee = result.get();
			 
		 }
		 else {
		 throw new RuntimeException("Did not find the employee with id = "+theId);
		 }
		return  theEmployee;
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepository.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteByID(int theId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(theId);
		
	}

}
