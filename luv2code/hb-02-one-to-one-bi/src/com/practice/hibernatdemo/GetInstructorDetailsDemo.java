package com.practice.hibernatdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernatdemo.entity.Instructor;
import com.practice.hibernatdemo.entity.InstructorDetail;
import com.practice.hibernatdemo.entity.Student;

import javassist.bytecode.InstructionPrinter;

/**
 * @author Sanjay
 *
 */
public class GetInstructorDetailsDemo {

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
			 
			int id1 = 1;
			//int id1 = 99;
			
			InstructorDetail detail = ses.get(InstructorDetail.class, id1);
			
			System.out.println("InstructorDetail    "+detail);
			
			System.out.println("Associated Instructor   "+detail.getInstructor());
			
			ses.getTransaction().commit();
			
		}
		catch( Exception exc) {
			exc.printStackTrace();
		}
		finally {
			ses.close();
		}

	}

}
