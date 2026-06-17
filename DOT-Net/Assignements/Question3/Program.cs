namespace Question3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Sum Calculator");
                Console.WriteLine("Enter Name for the student : ");
                string? name = Console.ReadLine();
                Console.WriteLine("Enter Marks for 5 Subjects : ");
                int m1 = Convert.ToInt32(Console.ReadLine());
                int m2 = Convert.ToInt32(Console.ReadLine());
                int m3 = Convert.ToInt32(Console.ReadLine());
                int m4 = Convert.ToInt32(Console.ReadLine());
                int m5 = Convert.ToInt32(Console.ReadLine());


                int sum = (m1 + m2 + m3 + m4 + m5);

                Console.WriteLine($"{name} has sum of 5 sub = {sum}");
            
            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (OverflowException e1)
            {
                Console.WriteLine(e1.Message);
            }
            catch (Exception e3)
            {

    Console.WriteLine(e3.Message);
}
        }
    }
}
