package com.practice.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	//com.practice.aopdemo.dao.AccountDao
	@Before("execution(public void addAccount(..))")
	
	//@Pointcut("execution(public void addAccount())")
	//private void addacctPointCut() {}
	
	//@Before("execution(public void com.practice.aopdemo.dao.AccountDao.addAccount())")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n===> executing @Before advice on addAccount()");
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		System.out.println("signature  "+signature);
		
		System.out.println("Printing Arguements  ");
		Object[] args = joinPoint.getArgs();
		for(Object obj : args) System.out.println((String)obj);
	}
	
	/*@AfterReturning(pointcut="execution(public String[] *(..))",returning = "result")
	public void getall(JoinPoint joinPoint,List<String> result) {
		System.out.println("In After returning advice");
		System.out.println("method signature  "+joinPoint.getSignature().toShortString());
		System.out.println("\n printing result captutrd");
		
		System.out.println("Result   "+result);
	}*/
	
}
