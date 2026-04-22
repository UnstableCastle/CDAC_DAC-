package session_14;
public class Test {	
	public static void main(String[] args) {	
		String s1 = "Nikita";
		String s2 = "Rahul";
		
			Thread t1 = new Thread()
				{
			public void run()
			{
				synchronized (s1) {
					System.out.println("Thread1 "
					+ "acquired Lock on resource1");
					try
					{
					Thread.sleep(500);
					}catch (Exception e) {
						System.out.println(e);
					}
					
					synchronized (s2) {
					}		System.out.println("Thread1 "
							+ "acquired Lock on resource2");
				}
			}
				};
				
				
				Thread t2 = new Thread()
				{
			public void run()
			{
				synchronized (s2) {
					System.out.println("Thread2 acquired "
							+ "Lock on resource2");
					
					try
					{
					Thread.sleep(500);
					}catch (Exception e) {
						System.out.println(e);
					}
					
					synchronized (s1) {
					}		System.out.println("Thread2 "
							+ "acquired Lock on resource1");
				}
			}
				};
		
		t1.start();
		t2.start();
	}
}
