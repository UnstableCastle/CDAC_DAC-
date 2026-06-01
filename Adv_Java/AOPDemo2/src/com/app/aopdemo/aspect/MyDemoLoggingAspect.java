package com.app.aopdemo.aspect;

import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.app.aopdemo.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@AfterReturning(pointcut = 
		"execution(* com.app.aopdemo.dao.AccountDAO.findAccounts(..))",
		returning = "result")
	public void afterReturningFindAccountAdvice(JoinPoint theJointPoint, 
			List<Account> result) {
		String method = theJointPoint.getSignature().toString();
		System.out.println("\n=======>Executing @AfterReturning on method: " 
		+ method);
		System.out.println("\n=======> Result is: " + result);
	}

	@AfterThrowing(pointcut =
			"execution(* com.app.aopdemo.dao.AccountDAO.findAccounts(..))",
			throwing = "theExec")
	public void afterThrowingFindAccountAdvice(JoinPoint theJointPoint, 
			Throwable theExec) {
		String method = theJointPoint.getSignature().toString();
		System.out.println("\n=======>Executing @AfterThrwoing on method: "
		+ method);
		System.out.println("\n=======> The Exception is: " + theExec);
	}
}
