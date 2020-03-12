package com.practice.hibernatdemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernatdemo.entity.Student;

public class ListAllDemo {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		
		try {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			//List<Student> stdList = session.createQuery("from Student").getResultList();//s.p@gmail.com
			
			//List<Student> stdList = session.createQuery("from Student s where s.id=1").getResultList();
			List<Student> stdList = session.createQuery("from Student s where s.email='s.p@gmail.com'").getResultList();
			System.out.println(stdList);
			
			Iterator<Student> itr;
			displayStudents(stdList);
			
			stdList = session.createQuery("from Student s where s.email like '%sanjay%'").getResultList();
			System.out.println(stdList);
			
			//itr = stdList.iterator();
			displayStudents(stdList);
			
			session.close();
		} finally {
			
		}
	}

	private static void displayStudents(List<Student> stdList) {
		Iterator<Student> itr = stdList.iterator();
		
		while(itr.hasNext()) {
			Student st2 = itr.next();
			System.out.println(""+st2);
		}
	}
}
