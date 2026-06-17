namespace Question5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Swap Two Numbers Using temp variable");

            int x = 10;
            int y = 20;
            Console.WriteLine($"x = {x}");
            Console.WriteLine($"y = {y}");
            int temp = x;
            x = y;
            y = temp;
            Console.WriteLine($"After swap x = {x}");
            Console.WriteLine($"After swap y = {y}");


        }
    }
}
