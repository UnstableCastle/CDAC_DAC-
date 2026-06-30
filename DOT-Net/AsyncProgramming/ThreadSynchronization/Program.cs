namespace ThreadSynchronization;

internal class Program
{
    private static int SharedResources = 0;
    static object o = new object();
    static void Main(string[] args)
    {
        Console.WriteLine("Thread - Synchronization");
        
        Console.WriteLine($"Main thread runs on {Thread.CurrentThread.ManagedThreadId}");
        Thread t1 = new Thread(new ThreadStart(Wall1));
        Thread t2 = new Thread(new ThreadStart(Wall2));

        t1.Start();
        t2.Start();
      

        t1.Join();
        t2.Join();


    }

    private static void Wall1() {

        Monitor.Enter(o);
        //lock (o) ;
        try
        {

            Console.WriteLine($"Wall 1 method runs on Thread id {Thread.CurrentThread.ManagedThreadId}");

            for (int i = 0; i < 10; i++)
            {
                if (i == 5)
                {
                    Thread.Sleep(5000);

                }
                Console.WriteLine($"wall - 1 - Shared resources Value = {++SharedResources}");
            }
        }
        catch (Exception e)
        {

            Console.WriteLine(e.Message);
        }
        finally {
            Monitor.Exit(o);
            

        }
        
        
    }

    private static void Wall2() {

        //Monitor.Enter(o);
        lock (o)
        {


            Console.WriteLine($"Wall 2 method runs on Thread id {Thread.CurrentThread.ManagedThreadId}");

            for (int i = 0; i < 10; i++)
            {

                Console.WriteLine($"wall - 2 - Shared resources Value = {++SharedResources}");
            }
            //Monitor.Exit(o);
        }

    }
    
}
