public class ThreadGroupDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup g1 = new ThreadGroup("Parent");

        // Runnable task
        Runnable task = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " running...");
                    Thread.sleep(500); // keep thread alive
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(g1, task, "t1");
        Thread t2 = new Thread(g1, task, "t2");
        Thread t3 = new Thread(g1, task, "t3");

        ThreadGroup g2 = new ThreadGroup(g1, "Child");
        Thread t4 = new Thread(g2, task, "t4");

        t1.setPriority(7);
        t2.setPriority(1);

        System.out.println("\nBefore start:");
        g1.list();

        System.out.println("Max Priority of g1: " + g1.getMaxPriority());

        t1.start();
        t2.start();

        Thread.sleep(1000); 

        System.out.println("\nAfter starting t1 & t2:");
        g1.list();

        t4.start();

        Thread.sleep(1000);

        System.out.println("\nAfter starting t4:");
        g1.list();
    }
}
