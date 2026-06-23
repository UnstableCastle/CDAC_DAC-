using FirstMVCApp.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace FirstMVCApp.Controllers
{
    public class EmployeeController : Controller
    {
        private readonly List<Employee> _employees;
        public EmployeeController()
        {
            _employees = new List<Employee>() { new Employee()
    {
        EmpId = 101,
        EmpName = "Amaan Sayyed",
        salary = 75000,
        Designation = "Software Developer"
    },
    new Employee()
    {
        EmpId = 102,
        EmpName = "Priya Sharma",
        salary = 68000,
        Designation = "UI/UX Designer"
    },
    new Employee()
    {
        EmpId = 103,
        EmpName = "Rahul Patil",
        salary = 82000,
        Designation = "Project Manager"
    },
    new Employee()
    {
        EmpId = 104,
        EmpName = "Sneha Joshi",
        salary = 60000,
        Designation = "QA Engineer"
    },
    new Employee()
    {
        EmpId = 105,
        EmpName = "Arjun Mehta",
        salary = 95000,
        Designation = "Tech Lead"
    },
    new Employee()
    {
        EmpId = 106,
        EmpName = "Neha Kulkarni",
        salary = 72000,
        Designation = "Business Analyst"
    }};
        }


        public IActionResult Index()
        {
            return View();
        }

        public IActionResult List()
        {

            return View(_employees);


        }
        public IActionResult Card()
        {

            return View(_employees);


        }
    }
}