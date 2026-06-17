namespace Question2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Average Calculator");

            int m1 = Convert.ToInt32(Console.ReadLine());
            int m2 = Convert.ToInt32(Console.ReadLine());
            int m3 = Convert.ToInt32(Console.ReadLine());
            int m4 = Convert.ToInt32(Console.ReadLine());
            int m5 = Convert.ToInt32(Console.ReadLine());


            int avg = m1 + m2 + m3 + m4 + m5 / 5;

            Console.WriteLine($"Average of 5 sub = ${avg}%");

        }
    }
}
