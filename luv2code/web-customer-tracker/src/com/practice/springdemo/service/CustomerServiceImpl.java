package com.practice.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.springdemo.dao.CustomerDAO;
import com.practice.springdemo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer cust) {
		customerDAO.saveCustomer(cust);		
	}
	@Override
	@Transactional
	public Customer getCustomer(int custId) {
		Customer cust = customerDAO.getCustomer(custId);
		return cust;
	}
	@Override
	@Transactional
	public void deleteCustomer(int custId) {
		customerDAO.deleteCustomer(custId);
		
	}

}
