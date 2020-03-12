package com.practice.hibernatdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernatdemo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//Create Session factory 
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		//Create Session
		Session ses = factory.getCurrentSession();
		try {
			System.out.println("Creating new object ..");
			
			Student st1 = new Student("BBBB", "JJJJJ", "b.j@gmail.com");
			
			ses.beginTransaction();
			System.out.println("Saving Student Object");
			
			ses.save(st1);
			
			System.out.println("Object Saved Successfully   "+st1.getId());
			
			System.out.println("Retrieving Object");
			
			Student st2 =  ses.get(Student.class, st1.getId());
			System.out.println("Retrieved .. "+st2);
			
			ses.getTransaction().commit();
			
		} finally {
			ses.close();
		}

	}

}
