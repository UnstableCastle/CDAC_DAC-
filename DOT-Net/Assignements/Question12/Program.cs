namespace Question12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Employee Number");
            int empno = Convert.ToInt32(Console.ReadLine());
        
            Console.WriteLine("Enter Department Number");
            int deptno = Convert.ToInt32(Console.ReadLine());
        
            Console.WriteLine("Enter designation code ");
            char dc = Convert.ToChar(Console.Read());

            Console.WriteLine($"Dept No | Dept Name | Desig Code | Desig");
            Console.WriteLine($"{deptno} | {} | {dc} | {}");
        
        
        
        }
    }
}
