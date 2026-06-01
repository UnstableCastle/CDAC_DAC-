package com.app.aopdemo.dao;

import org.springframework.stereotype.Component;
import com.app.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount,boolean vipFlag)
	{
		System.out.println(getClass()+" Doing my DB Work: Adding an account");
	}
	
	public boolean doWork()
	{
		System.out.println(getClass()+"Do Work");
		return false;
	}
}




