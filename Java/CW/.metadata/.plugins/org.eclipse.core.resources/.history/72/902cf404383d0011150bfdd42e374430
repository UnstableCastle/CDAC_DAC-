package session_13;
public class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread()
	.getName()+" "+Thread.currentThread().getState()+" "+
				Thread.currentThread().getId());
	}
	
	public static void main(String[] args) {
		MyThread r1 = new MyThread();
		Thread t1 = new Thread(r1);
		MyThread r2 = new MyThread();
		Thread t2 = new Thread(r2);
		MyThread r3 = new MyThread();
		Thread t3 = new Thread(r3);
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("t1 = "+t1.getState());
		System.out.println("t2 = "+t2.getState());
		System.out.println("t3 = "+t3.getState());
	}

}
