package com.practice.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	/* @Transactional *///Handling In Service Layer
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> query =session.createQuery("from Customer order by firstName",Customer.class);
		
		List<Customer> lst = query.list();
		
		return lst;
	}

	@Override
	public void saveCustomer(Customer cust) {
		Session session =  sessionFactory.getCurrentSession();
		
		//session.save(cust);
		session.saveOrUpdate(cust);
	}

	@Override
	public Customer getCustomer(int custId) {
		Session session =  sessionFactory.getCurrentSession();
		return session.get(Customer.class, custId);
	}

	@Override
	public void deleteCustomer(int custId) {
		Session session =  sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", custId);
		
		query.executeUpdate();
		
		
	}

}
