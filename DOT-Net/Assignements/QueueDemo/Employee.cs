
namespace QueueDemo;

internal class Employee
{
    public int id { get; set; }
    public string? name { get; set; }
    public double salary { get; set; }

    public override string? ToString()
    {
        return id + " " + name + " " + salary;
    }
}