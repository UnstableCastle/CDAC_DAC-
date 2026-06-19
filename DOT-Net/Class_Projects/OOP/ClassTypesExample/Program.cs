namespace ClassTypesExample;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Class Types!");
        //Object Initializer
        PrimeCustomer primeCustomer = new PrimeCustomer(1499) { ContactName = "Mainsh K.", City = "Raipur" };
        Customer customer = new() { CustomerId=1001, ContactName = "Alisha C.", City = "Mumbai" };
        Order order = new() { OrderDate=DateTime.Now,Quantity=100 };
        var CustomerOrders = new { CustId=customer.CustomerId, Oid=order.OrderId,Qty=order.Quantity };

        //InfowayMath math = new InfowayMath();
        //Console.WriteLine(MyCalculator.IncrementCounter());
        //Console.WriteLine(MyCalculator.IncrementCounter());
        //Console.WriteLine(MyCalculator.IncrementCounter());
        InfowaySales s1 = new();
        InfowaySales s2 = new();
        InfowaySales s3 = new();
        InfowaySales s4 = new();
    }
}
