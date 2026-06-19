namespace Question2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Average Calculator!");
                Console.WriteLine("Enter Student Name");
                string? name = Console.ReadLine();
                Console.WriteLine("Please enter 5 marks!");
                int m1 = Convert.ToInt32(Console.ReadLine());
                int m2 = Convert.ToInt32(Console.ReadLine());
                int m3 = Convert.ToInt32(Console.ReadLine());
                int m4 = Convert.ToInt32(Console.ReadLine());
                int m5 = Convert.ToInt32(Console.ReadLine());
                int averagMarks = (m1 + m2 + m3 + m4 + m5) / 5;
                Console.WriteLine($"Student {name} has got {averagMarks} 5 subject average marks!");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
                
            }
        }
    }
}
