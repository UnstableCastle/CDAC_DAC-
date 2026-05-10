public class JoinDemo implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());

		for (int i = 0; i < 4; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new JoinDemo(), "t1");
		Thread t2 = new Thread(new JoinDemo(), "t2");
		Thread t3 = new Thread(new JoinDemo(), "t3");

		
		System.out.println("Before start:");
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());

		t1.start();
		t2.start();
		t3.start();

		Thread.sleep(5000);

		System.out.println("===============");
		

		t1.join();
		t2.join();
		t3.join();

		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
	}
}
