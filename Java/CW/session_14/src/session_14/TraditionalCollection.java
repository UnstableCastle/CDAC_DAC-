package session_14;
import java.util.ArrayList;
import java.util.Iterator;
public class TraditionalCollection extends Thread{
	public static ArrayList<String> l =
			new ArrayList<String>();

	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread is updating list");
		l.add("mno");
	}
	
	public static void main(String[] args) 
			throws InterruptedException {
		l.add("abc");
		l.add("pqr");
		l.add("rtf");
		
		TraditionalCollection t = 
				new TraditionalCollection();
		t.start();
		
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
		System.out.println("Main thread Iterating "+str);
			Thread.sleep(3000);
		}
		
		System.out.println(l);
		
	}
	
}
