using DemoWebApp.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace DemoWebApp.Controllers
{
    public class EmployeesController : Controller
    {
        // 1. Made the list 'static' so data persists across HTTP requests
        private static List<Employee> employees = new List<Employee>
        {
            new Employee() { empId = 1, Name = "A" },
            new Employee() { empId = 2, Name = "q" },
            new Employee() { empId = 3, Name = "s" },
            new Employee() { empId = 4, Name = "f" },
            new Employee() { empId = 5, Name = "c" }
        };

        // GET: EmployeesController
        public ActionResult Index()
        {
            ViewData["pageTitle"] = "Employee List";
            TempData["SuccessMessage"] = "New employee successfully added!";
            return View(employees);
        }
        public ActionResult ALLe()
        {
            ViewData["pageTitle"] = "Employee List";
            TempData["SuccessMessage"] = "New employee successfully added!";
            return View(employees);
        }

        // GET: EmployeesController/Details/5
        public ActionResult Details(int id)
        {
            var employee = employees.FirstOrDefault(e => e.empId == id);
            if (employee == null) return NotFound();

            return View(employee);
        }

        // GET: EmployeesController/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: EmployeesController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        // 2. Replaced IFormCollection with the actual Employee model for Model Binding
        public ActionResult Create(Employee newEmployee)
        {
            try
            {
                // Auto-increment the ID
                newEmployee.empId = employees.Any() ? employees.Max(e => e.empId) + 1 : 1;
                employees.Add(newEmployee);

                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Edit/5
        public ActionResult Edit(int id)
        {
            var employee = employees.FirstOrDefault(e => e.empId == id);
            if (employee == null) return NotFound();

            return View(employee);
        }

        // POST: EmployeesController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Employee updatedEmployee)
        {
            try
            {
                var existingEmployee = employees.FirstOrDefault(e => e.empId == id);
                if (existingEmployee == null) return NotFound();

                // Update properties
                existingEmployee.Name = updatedEmployee.Name;
                // Update other properties here as you add them to your model...

                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Delete/5
        public ActionResult Delete(int id)
        {
            var employee = employees.FirstOrDefault(e => e.empId == id);
            if (employee == null) return NotFound();

            return View(employee);
        }

        // POST: EmployeesController/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            try
            {
                var employee = employees.FirstOrDefault(e => e.empId == id);
                if (employee != null)
                {
                    employees.Remove(employee);
                }

                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}