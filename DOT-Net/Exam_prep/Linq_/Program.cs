namespace Linq_
{
    internal class Program
    {
        static void Main(string[] args)
        {

            List<Department> dept_list = new List<Department> {
                          new Department() {deptId=1,deptName="IT"},
                          new Department() { deptId=2 ,deptName="HR"},
                          new Department() { deptId=3 ,deptName="Sales"}

                };
            List<Employee> emp_list = new List<Employee>
            {
                new Employee(){employeeID=1,empName="A",city="Pune", deptId=1,salary=10000 },
                new Employee(){employeeID=2,empName="B",city="Delhi", deptId=1,salary=10000 },
                new Employee(){employeeID=3,empName="C",city="Pune", deptId=2,salary=10000 },
                new Employee(){employeeID=4,empName="D",city="Pune", deptId=2,salary=10000 },
                new Employee(){employeeID=4,empName="E",city="Pune", deptId=3,salary=10000 }
             };

           
            var q = from Employee in emp_list
                    join Department in dept_list
                    on Employee.deptId equals Department.deptId
                    select new
                    {
                        Employee.employeeID, Employee.empName, Employee.city,
                        Department.deptId, Department.deptName
 
                    };

            foreach (var item in q)
            {
                Console.WriteLine($"Employee {item.empName} is in Dept {item.deptName} in {item.city} City");
            };
}
}
}
