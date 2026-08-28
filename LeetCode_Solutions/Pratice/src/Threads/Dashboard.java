package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Dashboard {
public static void main(String[] args) {
	
	ExecutorService threadPool = Executors.newFixedThreadPool(2);
	
	Callable<String> fetchProfile = ()->{
		Thread.sleep(2000);
		return "{name: 'Amaan' , role: 'Admin'}";
	};
	
	Callable<String> fetchOrder = ()->{
		
		Thread.sleep(3000);
		return "[Order 1 , Order 2 , Order 3]";
	
	};
	
	try {
        System.out.println("Fetching data...");
        long startTime = System.currentTimeMillis();
        
        // 4. Submit the tasks to the pool. They give you 'Futures' back instantly!
        Future<String> profileFuture = threadPool.submit(fetchProfile);
        // TODO: Submit the 'fetchOrders' task to the pool and store its Future!
        
        // 5. Extract the actual data from the Futures. 
        // The .get() method will block (wait) until the thread actually finishes.
        String profileData = profileFuture.get();
        // TODO: Extract the actual data from the orders Future!
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Profile: " + profileData);
        // System.out.println("Orders: " + orderData);
        System.out.println("Total time: " + (endTime - startTime) + " ms");
        
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // 6. ALWAYS shut down your thread pool, or the JVM will never exit!
        threadPool.shutdown(); 
    }
}
}