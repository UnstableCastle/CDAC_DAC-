namespace Question8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Check Leap Year");
            try
            {
                Console.WriteLine("Enter a year:");
                int year = Convert.ToInt32(Console.ReadLine());

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                {
                    Console.WriteLine($"{year} is a Leap Year");
                }
                else
                {
                    Console.WriteLine($"{year} is Not a Leap Year");
                }
                  }
                    catch (FormatException e)
                  {
                    Console.WriteLine(e.Message);
                   }
                    catch (Exception e3)
                    {

                Console.WriteLine(e3.Message);
            }
        }
    }
}
