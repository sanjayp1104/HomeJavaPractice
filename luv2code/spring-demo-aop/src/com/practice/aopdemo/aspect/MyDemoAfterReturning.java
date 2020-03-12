package com.practice.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyDemoAfterReturning {
	@AfterReturning(pointcut="execution(* get*())",returning = "result")
	public void getall(JoinPoint joinPoint,List<String> result) {
		System.out.println("In After returning advice");
		System.out.println("method signature  "+joinPoint.getSignature().toShortString());
		System.out.println("\n printing result captutrd");
		
		System.out.println("Result   "+result);
	}
}
