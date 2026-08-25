package Threads;

public class MyChef extends Thread{

	@Override
	public void run() {
		System.out.println("chef is cokking on the thread "+Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		
		MyChef chef = new MyChef();
		chef.start();
		
	}
}
