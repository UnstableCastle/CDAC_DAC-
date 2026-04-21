//SyncMethodThread
public class Account {

	private int balance;

	public Account() {
		balance = 5000;

	}

	public synchronized void deposit(int amount) throws InterruptedException {

		System.out.println(Thread.currentThread().getName() + "" + " Started");

		int temp;
		temp = balance;
		temp += amount;
		balance = temp;

		System.out.println("temp " + temp);

	}

	public int getBalance() {
		return balance;
	}

}
