package com.app.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.aopdemo.dao.AccountDAO;

public class AfterReturningAdviceDemo {
	public static void main(String[] args) {
		//read spring config class
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from the Spring Container
		AccountDAO theDAO = context.getBean("accountDAO",AccountDAO.class);
				
		List<Account> theAccounts = theDAO.findAccounts(false);
		
		//display the accounts
		System.out.println("\n\nMain Program: AfterReturningAdvice: ");
		System.out.println("-----------");
		System.out.println(theAccounts);
		System.out.println("\n");
		
		context.close();
	}

}
