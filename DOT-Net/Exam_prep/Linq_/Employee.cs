using System;
using System.Collections.Generic;
using System.Text;

namespace Linq_;

public class Employee
{
    public int employeeID { get; set; }
    public string empName { get; set; } = string.Empty;
    public int  salary { get; set; }
    public string city { get; set; } = string.Empty;
    public int deptId { get; set; }
    public Department? department { get; set; }
}
