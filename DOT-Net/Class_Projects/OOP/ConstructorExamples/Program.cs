namespace ConstructorExamples;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Constructor Examples!");
        Child child1 = new Child(100, "Abcd", "XYZ");
        Child child2 = new Child(child1);
        Console.WriteLine(child2.ContactName);
    }
}
