namespace Question9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter Basic Salary:");
                double basicSalary = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Enter Total Sales Amount:");
                double sales = Convert.ToDouble(Console.ReadLine());

                double commissionRate = 0;

                if (sales >= 5000 && sales <= 7500)
                {
                    commissionRate = 3;
                }
                else if (sales >= 7501 && sales <= 10500)
                {
                    commissionRate = 8;
                }
                else if (sales >= 10501 && sales <= 15000)
                {
                    commissionRate = 11;
                }
                else if (sales > 15000)
                {
                    commissionRate = 15;
                }

                double commission = sales * commissionRate / 100;
                double netSalary = basicSalary + commission;

                Console.WriteLine($"Commission Earned = {commission}");
                Console.WriteLine($"Net Salary = {netSalary}");
            }

            catch (FormatException e)
            
            {
            
                //Console.WriteLine(e.StackTrace);
                Console.WriteLine(e.Message);
            }

            
            catch (Exception e3)
            
            {

                Console.WriteLine(e3.Message);
            }
        }
    }
}
