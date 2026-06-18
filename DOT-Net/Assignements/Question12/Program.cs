namespace Question12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {

                Console.Write("Enter Employee No: ");
                int empNo = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine();
                
                Console.WriteLine("10 - Purchase");
                Console.WriteLine("20 - Sales");
                Console.WriteLine("30 - Production");
                Console.WriteLine("40 - Marketing");
                Console.WriteLine("50 - Accounts");
                Console.WriteLine("");
                Console.Write("Enter Department No: "); Console.Write("Enter Department No: ");
                int deptNo = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine();

                Console.WriteLine("M - MANAGER");
                Console.WriteLine("S - SUPERVISOR");
                Console.WriteLine("A - ANALYST");
                Console.WriteLine("s - Sales Person");
                Console.WriteLine("a - Accountant");
                Console.WriteLine("");
                Console.Write("Enter Designation Code: ");
                char code = Convert.ToChar(Console.Read());

                string dept = "", desig = "";

                switch (deptNo)
                {
                    case 10: dept = "Purchase"; break;
                    case 20: dept = "Sales"; break;
                    case 30: dept = "Production"; break;
                    case 40: dept = "Marketing"; break;
                    case 50: dept = "Accounts"; break;
                }

                switch (code)
                {
                    case 'M': desig = "Manager"; break;
                    case 'S': desig = "Supervisor"; break;
                    case 'A': desig = "Analyst"; break;
                    case 's': desig = "Sales Person"; break;
                    case 'a': desig = "Accountant"; break;
                }

                Console.WriteLine($"Employee No : {empNo}");
                Console.WriteLine($"Department  : {dept}");
                Console.WriteLine($"Designation : {desig}");


            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (Exception e2)
            {

                Console.WriteLine(e2.Message);
            }
        }
    }
}
