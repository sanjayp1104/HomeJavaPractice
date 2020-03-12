package com.practice.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach c = context.getBean("thatSillyCoach",Coach.class);
		Coach c = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		//context.close();

	}

}
