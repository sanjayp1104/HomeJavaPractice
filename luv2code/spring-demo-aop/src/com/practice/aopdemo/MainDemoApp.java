package com.practice.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.aopdemo.dao.AccountDao;
import com.practice.aopdemo.dao.MembershipDoa;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao accountDao = context.getBean(AccountDao.class);
		accountDao.addAccount();
		
		
		MembershipDoa membershipDoa = context.getBean(MembershipDoa.class);
		
		membershipDoa.addAccount("Sanjay");
		
		System.out.println("AfterReturning Advice Testing");
		
		String str[] = accountDao.getAllAcctNames();
		
		for(String s : str) System.out.println(s);
		
		context.close();
	}

}
