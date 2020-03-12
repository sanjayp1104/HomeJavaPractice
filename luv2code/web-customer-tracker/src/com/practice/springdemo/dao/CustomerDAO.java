package com.practice.springdemo.dao;

import java.util.List;

import com.practice.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer cust);

	public Customer getCustomer(int custId);

	public void deleteCustomer(int custId);
}
