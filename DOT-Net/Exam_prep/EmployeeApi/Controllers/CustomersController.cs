using eCommerce.Mvc.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace eCommerce.Mvc.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CustomersController : ControllerBase
    {
        private static List<Customer> customers = new List<Customer>
        {
            new Customer { CustomerId = 1, ContactName = "Alice Smith", Address = "123 Tech Lane", City = "Seattle" },
            new Customer { CustomerId = 2, ContactName = "Bob Johnson", Address = "456 Market St", City = "San Francisco" }
        };

        // GET: api/Customers
        [HttpGet]
        public ActionResult<IEnumerable<Customer>> Get()
        {
            return Ok(customers);
        }

        // GET api/Customers/5
        [HttpGet("{id}")]
        public ActionResult<Customer> Get(int id)
        {
            var customer = customers.FirstOrDefault(c => c.CustomerId == id);
            if (customer == null)
            {
                return NotFound($"Customer with Id {id} not found.");
            }
            return Ok(customer);
        }

        // POST api/Customers
        [HttpPost]
        public ActionResult<Customer> Post([FromBody] Customer newCustomer)
        {
            if (newCustomer == null)
            {
                return BadRequest("Invalid customer data.");
            }

            newCustomer.CustomerId = customers.Any() ? customers.Max(c => c.CustomerId) + 1 : 1;
            customers.Add(newCustomer);

            return CreatedAtAction(nameof(Get), new { id = newCustomer.CustomerId }, newCustomer);
        }

        // PUT api/Customers/5
        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] Customer updatedCustomer)
        {
            var existingCustomer = customers.FirstOrDefault(c => c.CustomerId == id);
            if (existingCustomer == null)
            {
                return NotFound($"Customer with Id {id} not found.");
            }

            existingCustomer.ContactName = updatedCustomer.ContactName;
            existingCustomer.Address = updatedCustomer.Address;
            existingCustomer.City = updatedCustomer.City;

            return NoContent();
        }

        // DELETE api/Customers/5
        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var customer = customers.FirstOrDefault(c => c.CustomerId == id);
            if (customer == null)
            {
                return NotFound($"Customer with Id {id} not found.");
            }

            customers.Remove(customer);
            return NoContent();
        }
    }
}