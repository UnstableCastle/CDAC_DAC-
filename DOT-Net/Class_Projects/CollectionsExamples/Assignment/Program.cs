namespace Assignment;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Object Initializer!");
        //Customer customer = new Customer() { CustomerId = 1, ContactName = "John Mark", City = "London" };

        //foreach (var customer in GetAllCustomers())
        //{
        //    Console.WriteLine($"Customer Id {customer.CustomerId}, Name {customer.ContactName} lives in city {customer.City}!");
        //}
        List<Result> finalResult=new List<Result>();
        foreach (Customer customer in GetAllCustomers())
        {
         Result? existingCustomer=    finalResult.Find(delegate (Result res) { return res.City == customer.City; });
            if (existingCustomer == null)
            {
                existingCustomer = new Result();
                existingCustomer.City = customer.City;
                existingCustomer.Count = 1;
                finalResult.Add(existingCustomer);
            }
            else 
            {
                existingCustomer.Count++;
            }
        }
        foreach (var item in finalResult)
        {
            Console.WriteLine($"In City {item.City}, there is/are {item.Count} number of customers!");
        }


    }
    private static List<Customer> GetAllCustomers()
    {
        return new List<Customer>()
        {
            new Customer() { CustomerId = 1, ContactName="John Mark", City="London" },
            new Customer() { CustomerId = 2, ContactName="Alicia Mark", City="London" },
            new Customer() { CustomerId = 3, ContactName="Alisha C.", City="Mumbai" },
            new Customer() { CustomerId = 4, ContactName="Manish Sharma", City="Delhi" },
            new Customer() { CustomerId = 5, ContactName="Manish Kaushik", City="Delhi" },
        };
    }
}
