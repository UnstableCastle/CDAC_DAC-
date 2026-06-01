package com.app.aopdemo;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.aopdemo.dao.AccountDAO;

public class AfterThrowingAdviceDemo {
	
	public static void main(String[] args) {
		//read spring config class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from the Spring Container
		AccountDAO theDAO = context.getBean("accountDAO",AccountDAO.class);
					
		List<Account> theAccounts = null;
		try
		{
			boolean tripWire = true;
			theAccounts = 
				theDAO.findAccounts(tripWire);
			
		}catch (Exception e) {
			System.out.println("\n\nMain program... "+e);
			System.out.println("hii");
			System.out.println("Hello");
		}
		
		//display the accounts
		System.out.println("\n\nMain Program: AfterRThrowingAdvice: ");
		System.out.println("-----------");
		System.out.println(theAccounts);
		System.out.println("\n");
		
		context.close();
	}

}
