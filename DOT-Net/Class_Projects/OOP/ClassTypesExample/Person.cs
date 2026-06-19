namespace ClassTypesExample;

//Generalization-To-Specialization
abstract class Person
{
    public int SocialId { get; set; }
    public string ContactName { get; set; } = string.Empty;
    public string Address { get; set; } = string.Empty;
    public string City { get; set; }=string.Empty;
    protected string? PAN { get; set; }
    public abstract bool ChangeAddress(string oldAddress, string newAddress);
}

//Customer-Is-A-Person
class Customer : Person
{
    public int CustomerId { get; set; }
    public override bool ChangeAddress(string oldAddress, string newAddress)
    {
        throw new NotImplementedException();
    }
    public ICollection<Order> Orders { get; set; }
}
//PrimeCustomer-Is-A-Customer
sealed class PrimeCustomer : Customer
{
    private readonly double _fees;
    public PrimeCustomer(double fees)
    {
        _fees = fees;
    }
    public double Fees { get { return _fees; } }
    //public double Fees { get; private set; } = 1499;
}

class Order { 

    public int OrderId { get; set; }
    public string CustomerId { get; set; }
    public int Quantity { get; set; }
    public DateTime OrderDate { get; set; }
}