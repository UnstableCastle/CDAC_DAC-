namespace ConstructorExamples;

internal class Parent
{
    public Parent()
    {
        Console.WriteLine("Parent Default Constructor");
    }
    public Parent(int id, string name, string city):this()
    {
        Console.WriteLine("Parent Parameterized Constructor");
        Id = id;
        ContactName = name;
        City = city;
    }
    public int Id { get; set; }
    public string? ContactName { get; set; }
    public string? City { get; set; }
}
internal class Child : Parent
{
    public Child()
    {
        Console.WriteLine("Child Default Constructor");
    }
    public Child(int id,string name,string city):base(id,name,city) 
    {
        
    }
    public Child(Child child)
    {
        Id = child.Id;
        ContactName = child.ContactName;
        City = child.City;
    }
}