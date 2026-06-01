package com.app.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;

	public List<Account> findAccounts(boolean tripWire) {
		if (tripWire) {
			throw new RuntimeException("No soup for you!!!");
		}

		List<Account> myAccounts = new ArrayList<Account>();

		// create sample Accounts
		Account a1 = new Account("ajinkya", "bhosale");
		Account a2 = new Account("shubham", "patil");
		Account a3 = new Account("pratik", "jadhav");

		myAccounts.add(a1);
		myAccounts.add(a2);
		myAccounts.add(a3);

		return myAccounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public void addAccount() {
		System.out.println(" Doing my DB Work: Adding an account");
	}

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " Doing my DB Work: Adding an account");
	}

	public boolean doWork() {
		System.out.println(getClass() + "Do Work");
		return false;
	}

}
