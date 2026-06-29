using eCommerce.Mvc.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace eCommerce.Mvc.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ShippersController : ControllerBase
    {
        private static List<Shipper> shippers = new List<Shipper>
        {
            new Shipper { ShipperId = 1, ShipperName = "Speedy Express", ShipperEmail = "contact@speedy.com", ShipperPhone = "555-0100", ShipperCity = "New York" },
            new Shipper { ShipperId = 2, ShipperName = "Global Logistics", ShipperEmail = "info@global.com", ShipperPhone = "555-0200", ShipperCity = "London" }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Shipper>> Get() => Ok(shippers);

        [HttpGet("{id}")]
        public ActionResult<Shipper> Get(int id)
        {
            var shipper = shippers.FirstOrDefault(s => s.ShipperId == id);
            if (shipper == null) return NotFound($"Shipper with Id {id} not found.");
            return Ok(shipper);
        }

        [HttpPost]
        public ActionResult<Shipper> Post([FromBody] Shipper newShipper)
        {
            if (newShipper == null) return BadRequest("Invalid shipper data.");
            newShipper.ShipperId = shippers.Any() ? shippers.Max(s => s.ShipperId) + 1 : 1;
            shippers.Add(newShipper);
            return CreatedAtAction(nameof(Get), new { id = newShipper.ShipperId }, newShipper);
        }

        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] Shipper updatedShipper)
        {
            var existingShipper = shippers.FirstOrDefault(s => s.ShipperId == id);
            if (existingShipper == null) return NotFound($"Shipper with Id {id} not found.");

            existingShipper.ShipperName = updatedShipper.ShipperName;
            existingShipper.ShipperEmail = updatedShipper.ShipperEmail;
            existingShipper.ShipperPhone = updatedShipper.ShipperPhone;
            existingShipper.ShipperCity = updatedShipper.ShipperCity;
            return NoContent();
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var shipper = shippers.FirstOrDefault(s => s.ShipperId == id);
            if (shipper == null) return NotFound($"Shipper with Id {id} not found.");

            shippers.Remove(shipper);
            return NoContent();
        }
    }
}