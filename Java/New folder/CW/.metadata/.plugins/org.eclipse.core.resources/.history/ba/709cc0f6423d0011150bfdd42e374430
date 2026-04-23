package session_12;
public class MyThread extends Thread implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()
				+" started");
		for(int i=1;i<=4;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()
					.getName()+
					" "+i);
		}	
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		//Born state
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}
	

}
