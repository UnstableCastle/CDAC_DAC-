
public class Test {

	public static void main(String[] args) throws InterruptedException {

		Account a = new Account();
		Account a1 = new Account();
		MyThread1 t1 = new MyThread1(a);
		MyThread2 t2 = new MyThread2(a1);
		t2.setPriority(7);
		t1.start();
//		t2.join();
		t2.start();
		
		System.out.println(t1.isAlive()+" t1 is Alive!!!!");
		Thread.sleep(1000);
		System.out.println("Balance  = " + a.getBalance());

		if ((t1.isAlive()) == false) {
			System.out.println("t1 in Dead!!!!");
		}
		
		Thread.currentThread().setDaemon(false);
		System.gc();
		System.out.println(Thread.currentThread().getName()+" ");
		
		
	}

}
