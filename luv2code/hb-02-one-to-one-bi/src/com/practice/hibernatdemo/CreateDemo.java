package com.practice.hibernatdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernatdemo.entity.Instructor;
import com.practice.hibernatdemo.entity.InstructorDetail;
import com.practice.hibernatdemo.entity.Student;

/**
 * @author Sanjay
 *
 */
public class CreateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create Session factory 
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		//Create Session
		Session ses = factory.getCurrentSession();
		try {		
			ses.beginTransaction();
			int id1 = 2;
			
			Instructor instructor = ses.get(Instructor.class, id1);
			
			if (instructor != null) {
				System.out.println("Deleting Instructor");
				ses.delete(instructor);
			}
			
			
			ses.getTransaction().commit();
			
		} finally {
			ses.close();
		}

	}

}
