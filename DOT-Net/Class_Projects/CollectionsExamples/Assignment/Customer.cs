namespace Assignment;

internal class Customer
{
    public int CustomerId { get; set; }
    public string ContactName { get; set; } = string.Empty;
    public string City { get; set; } = string.Empty;
}

class Result
{
    public int Count { get; set; }
    public string City { get; set; } = string.Empty;
}
