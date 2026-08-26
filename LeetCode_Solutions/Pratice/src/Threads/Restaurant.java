package Threads;

public class Restaurant {
    public static void main(String[] args) {
        
        // 1. Create the SINGLE shared resource (The Mutex lock)
        Plate sharedPlate = new Plate();
        
        // 2. Create the Chef Task (Runnable)
        Runnable chefTask = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedPlate.serveFood();
                    Thread.sleep(500); // Chef takes 0.5 seconds to cook
                }
            } catch (InterruptedException e) {
                System.out.println("Chef was interrupted!");
            }
        };
        
        // 3. Create the Waiter Task (Runnable)
        Runnable waiterTask = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedPlate.takeFood();
                    Thread.sleep(1000); // Waiter takes 1 second to walk to the table
                }
            } catch (Exception e) {
                System.out.println("Waiter was interrupted!");
            }
        };
        
        // 4. Give the tasks to actual Threads and name them
        Thread chefThread = new Thread(chefTask, "ChefThread");
        Thread waiterThread = new Thread(waiterTask, "WaiterThread");
        
        // 5. Fire them up! (NEVER call .run() directly!)
        System.out.println("Opening the restaurant...\n");
        chefThread.start();
        waiterThread.start();
    }
}