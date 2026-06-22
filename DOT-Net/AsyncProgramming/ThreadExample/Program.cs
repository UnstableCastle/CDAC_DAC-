namespace ThreadExample;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Simple Threading!");
        Console.WriteLine($"Main Method runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
        Thread t1 = new Thread(new ThreadStart(Wall1));
        Thread t2 = new Thread(new ThreadStart(Wall2));
        t1.Priority = ThreadPriority.Normal;
        t2.Priority = ThreadPriority.Highest;
        t1.Start();
        t2.Start();

        t1.Join();
        t2.Join();
        Console.WriteLine("Main Method Ended!");
    }
    private static void Wall1()
    {
        Console.WriteLine($"Wall1 Method runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
        for (int i = 0; i < 10; i++)
        {
            Console.WriteLine($"Wall - 1 - Brick - {i}");
        }
    }
    private static void Wall2()
    {
        Console.WriteLine($"Wall - 2 Method runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
        for (int i = 0; i < 10; i++)
        {
            Console.WriteLine($"Wall - 2 - Brick - {i}");
        }
    }
}
