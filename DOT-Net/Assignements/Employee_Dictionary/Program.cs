namespace Employee_Dictionary
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("employee dictionary");
            Dictionary<int,Employee> list= new Dictionary<int,Employee>();
            list.Add(1, new Employee() { id = 100, name = "ABC", salary=  1000 });
            list.Add(2, new Employee() { id = 101, name = "DEF", salary = 2000 });
            list.Add(3, new Employee() { id = 102, name = "GHI", salary = 3000 });
            list.Add(4, new Employee() { id = 103, name = "JKL", salary = 4000 });
            list.Add(5, new Employee() { id = 104, name = "MNO", salary = 5000 });

            foreach (var item in list)
            {
                Console.WriteLine($"{item.Key} {item.Value.id} {item.Value.name} {item.Value.salary}");
            }

        }
    }
}
