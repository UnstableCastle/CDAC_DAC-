namespace School;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Aggregation");

        Teacher t1 = new Teacher("Teacher_1");
        Teacher t2 = new Teacher("Teacher_2");

        {
            Department mathDept = new Department("Mathematics");
            mathDept.AddTeacher(t1);
            mathDept.AddTeacher(t2);
            mathDept.listTeacher();
        }
    }
}