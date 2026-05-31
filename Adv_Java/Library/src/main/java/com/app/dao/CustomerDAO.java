package com.app.dao;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
