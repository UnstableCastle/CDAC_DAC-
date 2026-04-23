package A5;

public abstract class Account {
int accNo;
private String name;
private double balance;
private String branch;

static double totalMoney = 0;

public Account() {}

public Account(int accNo, String name, double balance, String branch) {
	super();
	this.accNo = accNo;
	this.name = name;
	this.balance = balance;
	this.branch = branch;
	totalMoney += balance;
}


abstract double getMinBalance();
abstract String getAccountType();

@Override
public String toString() {
	return "Account [accNo=" + accNo + ", Name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
}

public void deposit(double amount) {
	if(amount > 0) {
		balance += amount;
		totalMoney +=amount;
		System.out.println("Rs "+ amount+" deposited");
		System.out.println("New balance = "+balance);
	}else {
		
		System.out.println("invalid balance ");
		
	}
	
	
}


public void displayDetails() {
	System.out.println("\n Account Details ");
	System.out.println("\n Account Number "+ accNo);
	System.out.println("\n Name :"+ name);
	System.out.println("\n Account Type "+getAccountType());
	System.out.println("\n Branch  "+branch);
	System.out.println("\n Balance "+balance);
	System.out.println("---------------------------");
}

public void withdraw(double amount) {
	
	if(amount<=0) {
		System.out.println(" invlid balance ");
		return;
	}
	
	if((balance - amount)>= getMinBalance()){
		balance-= amount;
		System.out.println("Rs "+ amount+" Withdrawned");
		System.out.println("New balance = "+balance);
		
	}else {
		System.out.println("Withdrwal failed ! Maintiaing a minimum balance is "+ getMinBalance() + " is required.");
	}	
	
}
}
