namespace ListDemo;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("customer list");
        List<Customer> list = new List<Customer>(); 
        list.Add(new Customer() {id=101 ,name="ABC",city="pqr" });
        list.Add(new Customer() {id=102 ,name="DEF",city="xyz" });
        list.Add(new Customer() {id=103 ,name="HIJ",city="abc" });
        list.Add(new Customer() {id=104 ,name="MNO",city="ijk" });

        foreach (Customer customer in list)
        {
            Console.WriteLine(customer);
        }
        try
        {
            Console.Write("Enter the city Name :");
            string? city = Console.ReadLine();
            foreach (Customer customer in list)
            {
                if (customer.city == city.ToLower())
                {
                    Console.WriteLine(customer);
                }
            }
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }

    }
}
