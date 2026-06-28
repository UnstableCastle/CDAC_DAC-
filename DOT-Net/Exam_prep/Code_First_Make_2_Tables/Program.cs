using Code_First_Make_2_Tables.Dal;

namespace Code_First_Make_2_Tables;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Hello, World!");

        using (var context = new schoolDBContext() ) {
     
        
        context.Database.EnsureCreated();
            Console.WriteLine("tables Created");
        }

    }
}
