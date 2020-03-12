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
public class DeleteDemo {

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
			/*
			 * Instructor ins = new Instructor("Sanjay", "Pamarthi",
			 * "Sanjay.pamarthi@gmail.com");
			 * 
			 * InstructorDetail detail = new InstructorDetail("sanjay.com", "Coding");
			 */
			
			Instructor ins = new Instructor("Visala", "Borra", "visu@gmail.com");
			
			InstructorDetail detail = new InstructorDetail("visalab.com", "eating");
			
			ins.setInstructorDetail(detail);//Linkage
			
			System.out.println("Saving objects");
			
			//It will automatically save InstructorDetail also, as CascadeType is All 
			ses.save(ins);
			
			
			ses.getTransaction().commit();
			
		} finally {
			ses.close();
		}

	}

}
