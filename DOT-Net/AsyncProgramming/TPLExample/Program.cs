using System;
using System.Threading;
using System.Threading.Tasks;

namespace TPLExample
{
    internal class Program
    {
        static void Main(string[] args)
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
            Console.WriteLine("--- Part 1 Completed ---\n");

          
            Task<int> t3 = Task.Run<int>(() =>
            {
                Console.WriteLine($"Task-3 runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
                return 12 * 12;
            });

            Task<int> t4 = Task.Run<int>(() =>
            {
                Console.WriteLine($"Task-4 runs on Thread Id {Thread.CurrentThread.ManagedThreadId}!");
                return 24 * 24;
            });

       
            Console.WriteLine($"Task-3 Result: {t3.Result}");
            Console.WriteLine($"Task-4 Result: {t4.Result}");

            Console.WriteLine("Main Method Ended!");
        }
    }
}