package session_14;
public class ThreadGroupD extends Thread{
	public ThreadGroupD() {}
	
	public ThreadGroupD(ThreadGroup tg,String name)
	{
		super(tg,name);
	}

	public void run()
	{
		System.out.println(Thread.currentThread()
				.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
