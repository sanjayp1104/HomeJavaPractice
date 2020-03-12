package com.practice.hibernatdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernatdemo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		try {
			Session session = factory.getCurrentSession();
			int sid = 4;
			session.beginTransaction();
			
			System.out.println("Getting Student with id "+sid);
			
			Student std1 = session.get(Student.class, sid);
			
			std1.setFirstName("Sanju");
			std1.setLastName("Pamarthi");
			
			session.getTransaction().commit();
			
			System.out.println("Value updated using Session");
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Student set email ='sanjay.pamarthi@yahoo.com' where id=1").executeUpdate();
			
			System.out.println("Email Id Updated sucussfully");
			
			session.getTransaction().commit();
			
			System.out.println("Deleting Object with id 5");
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Student ss1 = session.get(Student.class, 5);
			
			session.delete(ss1);
			
			session.getTransaction().commit();
			
			System.out.println("Record deleted successfully");
			
			
		} finally {
			// TODO: handle finally clause
		}
		

	}

}
