package session_13;
public class ThreadGroupDemo {
	public static void main(String[] args) 
			throws InterruptedException {
		System.out.println(Thread.currentThread()
				.getName());//main
		System.out.println(Thread.currentThread()
				.getThreadGroup().getName());//main
		System.out.println(Thread.currentThread()
		.getThreadGroup().getParent().getName());//system
	
		ThreadGroup g1 = new ThreadGroup("Parent");
		//System.out.println(g1);
		Thread t1 = new Thread(g1, "t1");
		Thread t2 = new Thread(g1, "t2");
		Thread t3 = new Thread(g1, "t3");
		ThreadGroup g2 = new ThreadGroup(g1, "Child");
		t1.start();
		t2.start();
		//System.out.println(g2);
		//System.out.println(g1.getParent().getName());
		g1.list();
		System.out.println(g1.getMaxPriority());
		g1.setMaxPriority(4);
		Thread t4 = new Thread(g1, "t4");
		t4.start();
		System.out.println(g1.getMaxPriority());
		System.out.println(t4.getPriority());
		Thread.currentThread().sleep(1000);
		g1.list();
		System.out.println(g1.activeCount());
	}
}


/*
public  void deposit(double amount)
{
	//load the balance 
	double temp;
	temp = balance;
	//add the amount
	temp+=amount
			//sleep
	sleep(ms);
	//update the balance
	balance = temp;
}


balance = 5000

t1 = 4000 temp = 9000
t2 = 3000 temp =8000


*/




