using eCommerce.Mvc.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;

namespace eCommerce.Mvc.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CartsController : ControllerBase
    {
        private static List<Cart> carts = new List<Cart>
        {
            new Cart { CartId = 1, CartDate = DateTime.Now.AddDays(-2), CustomerId = 1 },
            new Cart { CartId = 2, CartDate = DateTime.Now, CustomerId = 2 }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Cart>> Get() => Ok(carts);

        [HttpGet("{id}")]
        public ActionResult<Cart> Get(int id)
        {
            var cart = carts.FirstOrDefault(c => c.CartId == id);
            if (cart == null) return NotFound($"Cart with Id {id} not found.");
            return Ok(cart);
        }

        [HttpPost]
        public ActionResult<Cart> Post([FromBody] Cart newCart)
        {
            if (newCart == null) return BadRequest("Invalid cart data.");
            newCart.CartId = carts.Any() ? carts.Max(c => c.CartId) + 1 : 1;
            carts.Add(newCart);
            return CreatedAtAction(nameof(Get), new { id = newCart.CartId }, newCart);
        }

        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] Cart updatedCart)
        {
            var existingCart = carts.FirstOrDefault(c => c.CartId == id);
            if (existingCart == null) return NotFound($"Cart with Id {id} not found.");

            existingCart.CartDate = updatedCart.CartDate;
            existingCart.CustomerId = updatedCart.CustomerId;
            return NoContent();
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var cart = carts.FirstOrDefault(c => c.CartId == id);
            if (cart == null) return NotFound($"Cart with Id {id} not found.");

            carts.Remove(cart);
            return NoContent();
        }
    }
}