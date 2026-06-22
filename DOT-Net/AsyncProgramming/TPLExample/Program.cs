namespace TPLExample;

internal class Program
{
    static void Main(string[] args)
    {
        {
            Console.WriteLine($"Main Method runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");

             var t1 = Task.Run(() =>
             {
                 Console.WriteLine($"Task-1 runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
                 for (int i = 0; i < 10; i++)
                 {
                     Console.WriteLine($"Task - 1 Value is {i}!");
                 }
             });
             var t2 = Task.Run(() =>
             {
                 Console.WriteLine($"Task-2 runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
                 for (int i = 0; i < 10; i++)
                 {
                     Console.WriteLine($"Task - 2 Value is {i}!");
                 }
             });
             Task.WaitAll(t1, t2);
            
            Task<int> t1 = Task.Run<int>(() =>
            {
                Console.WriteLine($"Task-1 runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
                return 12 * 12;
            });
            Task<int> t2 = Task.Run<int>(() =>
            {
                Console.WriteLine($"Task-2 runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
                return 24 * 24;
            });
            Console.WriteLine(t1.Result);
            Console.WriteLine(t2.Result);
            Console.WriteLine("Main Method Ended!");
        }
    }
}