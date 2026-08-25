package Threads;
//Thread
public class MyCleaner implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("washing dishes");
	}

	public static void main(String[] args) {
		MyCleaner cleaner = new MyCleaner();
		Thread t1 = new Thread(cleaner);
		t1.start();
	}
	
}
