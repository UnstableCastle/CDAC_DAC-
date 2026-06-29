using eCommerce.Mvc.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace eCommerce.Mvc.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CartItemsController : ControllerBase
    {
        private static List<CartItem> cartItems = new List<CartItem>
        {
            new CartItem { CartItemId = 1, CartId = 1, ProductId = 1, Quantity = 2 },
            new CartItem { CartItemId = 2, CartId = 1, ProductId = 2, Quantity = 1 }
        };

        [HttpGet]
        public ActionResult<IEnumerable<CartItem>> Get() => Ok(cartItems);

        [HttpGet("{id}")]
        public ActionResult<CartItem> Get(int id)
        {
            var cartItem = cartItems.FirstOrDefault(c => c.CartItemId == id);
            if (cartItem == null) return NotFound($"CartItem with Id {id} not found.");
            return Ok(cartItem);
        }

        [HttpPost]
        public ActionResult<CartItem> Post([FromBody] CartItem newCartItem)
        {
            if (newCartItem == null) return BadRequest("Invalid cart item data.");
            newCartItem.CartItemId = cartItems.Any() ? cartItems.Max(c => c.CartItemId) + 1 : 1;
            cartItems.Add(newCartItem);
            return CreatedAtAction(nameof(Get), new { id = newCartItem.CartItemId }, newCartItem);
        }

        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] CartItem updatedCartItem)
        {
            var existingCartItem = cartItems.FirstOrDefault(c => c.CartItemId == id);
            if (existingCartItem == null) return NotFound($"CartItem with Id {id} not found.");

            existingCartItem.CartId = updatedCartItem.CartId;
            existingCartItem.ProductId = updatedCartItem.ProductId;
            existingCartItem.Quantity = updatedCartItem.Quantity;
            return NoContent();
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var cartItem = cartItems.FirstOrDefault(c => c.CartItemId == id);
            if (cartItem == null) return NotFound($"CartItem with Id {id} not found.");

            cartItems.Remove(cartItem);
            return NoContent();
        }
    }
}