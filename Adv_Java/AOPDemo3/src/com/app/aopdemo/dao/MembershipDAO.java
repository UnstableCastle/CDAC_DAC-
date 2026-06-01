package com.app.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	

	public String addSilly()
	{
		return getClass()+"Doing my MemDB work: Adding an Membership Account";
	}
	
	public void goToSleep()
	{
		System.out.println(getClass()+" I am going to sleep now");
	}

}
