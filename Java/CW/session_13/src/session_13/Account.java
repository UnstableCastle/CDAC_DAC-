package session_13;
public class Account {
	private int balance;
	
	public Account() {
		balance = 5000;
	}
	
	public synchronized void deposit(int amount) 
			throws InterruptedException
	{
		System.out.println(Thread.currentThread()
				.getName()+" started");
		int temp;
		temp = balance;
		temp+=amount;
		System.out.println("temp "+temp);
		Thread.currentThread().sleep(1000);
		balance = temp;
		System.out.println(Thread.currentThread()
			.getName()+" completed"+" "+balance);
	}
	
	public int getBalance()
	{
		return balance;
	}
}
