using eCommerce.Mvc.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;

namespace eCommerce.Mvc.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class InvoicesController : ControllerBase
    {
        private static List<Invoice> invoices = new List<Invoice>
        {
            new Invoice { InvoiceId = 1, InvoiceDate = DateTime.Now.AddDays(-1), CartId = 1 }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Invoice>> Get() => Ok(invoices);

        [HttpGet("{id}")]
        public ActionResult<Invoice> Get(int id)
        {
            var invoice = invoices.FirstOrDefault(i => i.InvoiceId == id);
            if (invoice == null) return NotFound($"Invoice with Id {id} not found.");
            return Ok(invoice);
        }

        [HttpPost]
        public ActionResult<Invoice> Post([FromBody] Invoice newInvoice)
        {
            if (newInvoice == null) return BadRequest("Invalid invoice data.");
            newInvoice.InvoiceId = invoices.Any() ? invoices.Max(i => i.InvoiceId) + 1 : 1;
            invoices.Add(newInvoice);
            return CreatedAtAction(nameof(Get), new { id = newInvoice.InvoiceId }, newInvoice);
        }

        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] Invoice updatedInvoice)
        {
            var existingInvoice = invoices.FirstOrDefault(i => i.InvoiceId == id);
            if (existingInvoice == null) return NotFound($"Invoice with Id {id} not found.");

            existingInvoice.InvoiceDate = updatedInvoice.InvoiceDate;
            existingInvoice.CartId = updatedInvoice.CartId;
            return NoContent();
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var invoice = invoices.FirstOrDefault(i => i.InvoiceId == id);
            if (invoice == null) return NotFound($"Invoice with Id {id} not found.");

            invoices.Remove(invoice);
            return NoContent();
        }
    }
}