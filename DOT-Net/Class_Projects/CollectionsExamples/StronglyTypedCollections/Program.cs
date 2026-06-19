using System.Collections;

namespace StronglyTypedCollections;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Why Not Weakly Typed Collection!");
        //ArrayList number=new ArrayList();
        //number.Add(1000);
        //int myNumber = number[0];
        //Stack stack=new Stack();
        //Hashtable hashtable=new Hashtable();
        List<int> numbers=new List<int>();
        numbers.Add(100);
        numbers.Add(200);
        numbers.Add(300);
        foreach (int item in numbers)
        {
            Console.WriteLine(item);
        }
        Stack<string> books=new Stack<string>();
        
        books.Push("C# V-1");
        books.Push("C# V-2");
        books.Push("C# V-3");
        foreach(string book in books)
        {
            Console.WriteLine(book);
        }

        Queue<int> tickets=new Queue<int>();
        tickets.Enqueue(100);
        tickets.Enqueue(200);
        tickets.Enqueue(300);
        Console.WriteLine(tickets.Peek());
        foreach (var tick in tickets)
        {
            Console.WriteLine(tick);
        }

        Dictionary<int, string> employees = new Dictionary<int, string>();
        employees.Add(100, "A");
        employees.Add(200, "B");
        employees.Add(300, "C");
        employees.Add(400, "D");
    }

}
