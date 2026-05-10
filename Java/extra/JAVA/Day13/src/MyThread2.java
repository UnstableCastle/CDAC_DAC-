
public class MyThread2 extends Thread {
	Account a;

	public MyThread2(Account a) {
		super();
		this.a = a;
	}
	
	public void run() {
		
		try {
			
			a.deposit(5000);
			
		}catch (InterruptedException e) {
		
			e.printStackTrace();
			
		}
		
		
		
	}
	
	
}
