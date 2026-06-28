using EmployeeApi.Model;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace EmployeeApi.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class EmployeesController : ControllerBase
    {
        // Made static so the data persists across different HTTP requests 
        // during runtime (otherwise, it reinitializes on every request)
        private static List<Employee> employees = new List<Employee>
        {
            new Employee { id = 1, Name = "A" },
            new Employee { id = 2, Name = "s" },
            new Employee { id = 3, Name = "d" },
            new Employee { id = 4, Name = "f" },
            new Employee { id = 5, Name = "e" },
            new Employee { id = 6, Name = "w" },
            new Employee { id = 7, Name = "Q" }
        };

        // GET: api/Employees
        [HttpGet]
        public ActionResult<IEnumerable<Employee>> Get()
        {
            return Ok(employees);
        }

        // GET api/Employees/5
        [HttpGet("{id}")]
        public ActionResult<Employee> Get(int id)
        {
            var employee = employees.FirstOrDefault(e => e.id == id);
            if (employee == null)
            {
                return NotFound($"Employee with Id {id} not found.");
            }
            return Ok(employee);
        }

        // POST api/Employees
        [HttpPost]
        public ActionResult<Employee> Post([FromBody] Employee newEmployee)
        {
            if (newEmployee == null)
            {
                return BadRequest("Invalid employee data.");
            }

            // Simple auto-increment for ID
            newEmployee.id = employees.Any() ? employees.Max(e => e.id) + 1 : 1;
            employees.Add(newEmployee);

            // Returns a 201 Created status code along with the location of the new resource
            return CreatedAtAction(nameof(Get), new { id = newEmployee.id }, newEmployee);
        }

        // PUT api/Employees/5
        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] Employee updatedEmployee)
        {
            var existingEmployee = employees.FirstOrDefault(e => e.id == id);
            if (existingEmployee == null)
            {
                return NotFound($"Employee with Id {id} not found.");
            }

            existingEmployee.Name = updatedEmployee.Name;
            // Map other properties here if your Employee model has them

            return NoContent(); // 204 No Content is standard for successful updates
        }

        // DELETE api/Employees/5
        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var employee = employees.FirstOrDefault(e => e.id == id);
            if (employee == null)
            {
                return NotFound($"Employee with Id {id} not found.");
            }

            employees.Remove(employee);
            return NoContent(); // 204 No Content
        }
    }
}