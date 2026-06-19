namespace ClassTypesExample;

internal static class MyCalculator
{
    public static int Counter { get; set; }
    public static int Addition(int a, int b)
    {
        return a + b;
    }
    public static int IncrementCounter()
    {
        return Counter++;
    }
}

class InfowaySales
{
    static InfowaySales()
    {
        Counter = 101;
        Console.WriteLine("Static Constructor Executed!");
    }
    public static int Counter { get; set; }
    public InfowaySales()
    {
        Console.WriteLine("Default Constructor Executed!");
        Console.WriteLine($"Instance Number od Sales is {Counter++}");
    }
}