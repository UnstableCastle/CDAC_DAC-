package com.app.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.aopdemo.dao.AccountDAO;
import com.app.aopdemo.dao.MembershipDAO;

public class MainDemo {
	
	public static void main(String[] args) {
		//read spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from the Spring Container
		AccountDAO theDAO = context.getBean("bean1",AccountDAO.class);
		MembershipDAO memDAO = context.getBean("bean2",MembershipDAO.class);
		
		Account myAccount = new Account();
		theDAO.addAccount(myAccount, true);
		theDAO.doWork();
		
		String s = memDAO.addSilly();
		System.out.println(s);
		memDAO.goToSleep();
		

		//close the context
		context.close();
	}

}
