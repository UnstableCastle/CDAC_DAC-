namespace Question11
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = 10;
            int y = 20;
            int z = 30;

            if ((x > y) && (x > z))
            {
                Console.WriteLine($"Max = {x}");
            }
            else if ((y > x) && (y > z))
            {
                Console.WriteLine($"Max = {y}");
            }
            else
            {
                Console.WriteLine($"Max = {z}");
            }

            Console.Write("");

            int max = (x > y) ? ((x > z) ? x : z): ((y > z) ? y : z);

            Console.WriteLine($"Max = {max}");

        }
}
}
