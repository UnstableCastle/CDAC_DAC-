package com.app.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.app.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}

	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("Executing @Before advice on addAccount()");
	}
	
	@After("forDaoPackage()")
	public void performAPIAnalytics()
	{
		System.out.println("\n------> Performing API Analytics");
	}
}
