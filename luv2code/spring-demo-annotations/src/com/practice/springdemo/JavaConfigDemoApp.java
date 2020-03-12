package com.practice.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//Coach c = context.getBean("thatSillyCoach",Coach.class);
		Coach c = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		//context.close();

	}

}
