using System.Collections;

namespace QueueDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("queue demo");
            Queue<Employee> queue = new Queue<Employee>();
           queue.Enqueue(new Employee() { id = 100, name = "ABC", salary = 1000 });
           queue.Enqueue(new Employee() { id = 101, name = "DEF", salary = 2000 });
           queue.Enqueue(new Employee() { id = 102, name = "GHI", salary = 3000 });
           queue.Enqueue(new Employee() { id = 103, name = "JKL", salary = 4000 });
           queue.Enqueue(new Employee() { id = 104, name = "MNO", salary = 5000 });

            foreach (Employee e in queue)
            {
                Console.WriteLine(e);
            }
            Console.WriteLine(" ");
            Console.WriteLine(queue.Peek());
            Console.WriteLine(queue.Count());
            Console.WriteLine(queue.Dequeue()+"\n depueued");
            Console.WriteLine("");
            foreach (Employee e in queue)
            {
                Console.WriteLine(e);
            }
        }
    }
}
