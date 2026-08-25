package Threads;

public class Plate {

	boolean hasFood = false;
	
	public synchronized void serveFood() throws InterruptedException {
		while(hasFood) {
			wait();
		}
		
		System.out.println("Chef served the food!");
		hasFood = true;
		
		notify();
		
	}
	
	public synchronized void takeFood() throws Exception {
		
		while(!hasFood) {
			wait(1000);
		}
		
		System.out.println("Waiter took food to table");
		hasFood = false;
		notify();
	}
	public static void main(String[] args) {
		
	}
	
}
