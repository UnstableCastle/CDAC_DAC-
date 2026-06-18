namespace Question15
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ascii of characters");
            for (int i = 0; i <= 255; i++)
            {
                Console.WriteLine($"{i} = {(char)i}");

                if ((i + 1) % 10 == 0)
                {
                    Console.WriteLine("Press any key...");
                    Console.ReadKey();
                }
            }
        }
    }
}
