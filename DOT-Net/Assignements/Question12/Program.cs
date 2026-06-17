namespace Question12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {

                Console.Write("Enter Employee No: ");
                int empNo = int.Parse(Console.ReadLine());

                Console.Write("Enter Department No: ");
                int deptNo = int.Parse(Console.ReadLine());

                Console.Write("Enter Designation Code: ");
                char code = char.Parse(Console.ReadLine());

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
