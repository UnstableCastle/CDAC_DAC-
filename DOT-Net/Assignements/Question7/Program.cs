namespace Question7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Calculate Net Salary");
            Console.WriteLine("");
            Console.WriteLine("Enter basic Salary");
            double b = Convert.ToDouble(Console.ReadLine());

            double hra = b * 20 / 100;  
            double da = b * 40 / 100;   
            double pf = b * 10 / 100;   

            double s = b + hra + da;
            double netSalary = s - pf;

            Console.WriteLine($"Net salary = {netSalary}");


        }
    }
}
