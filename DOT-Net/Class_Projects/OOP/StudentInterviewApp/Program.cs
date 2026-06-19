namespace StudentInterviewApp;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Welcome To Interview App!");
        try
        {
            Student student = new Student();
            student.StudentId = 183;
            student.StudentName = "Manish Kaushik";
            student.CompanyName = "My Company";
            student.TotalMarks = 57;
            string myMessage = string.Empty; ;
            Console.WriteLine(student.CalculateResult(student.TotalMarks,ref myMessage));
            Console.WriteLine(myMessage);
            student.Companies("India", "Infosys");
            student.Companies("India", "Infosys","Synechron");
            student.Companies("India", "Infosys", "Synechron","Bajaj","Bosch");
        }
        catch(ArgumentException ae)
        {
            Console.WriteLine(ae.Message);
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
    }
}
