using eCommerce.Mvc.Models;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;

namespace eCommerce.Mvc.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ProductsController : ControllerBase
    {
        private static List<Product> products = new List<Product>
        {
            new Product { ProductId = 1, ProductName = "Laptop", Description = "High performance laptop", UnitPrice = 1200.50m, BrandId = 1, CategoryId = 1, ManufacturingDate = DateTime.Now.AddMonths(-6) },
            new Product { ProductId = 2, ProductName = "Headphones", Description = "Noise-cancelling", UnitPrice = 250.00m, BrandId = 2, CategoryId = 2, ManufacturingDate = DateTime.Now.AddMonths(-2) }
        };

        // GET: api/Products
        [HttpGet]
        public ActionResult<IEnumerable<Product>> Get()
        {
            return Ok(products);
        }

        // GET api/Products/5
        [HttpGet("{id}")]
        public ActionResult<Product> Get(int id)
        {
            var product = products.FirstOrDefault(p => p.ProductId == id);
            if (product == null)
            {
                return NotFound($"Product with Id {id} not found.");
            }
            return Ok(product);
        }

        // POST api/Products
        [HttpPost]
        public ActionResult<Product> Post([FromBody] Product newProduct)
        {
            if (newProduct == null)
            {
                return BadRequest("Invalid product data.");
            }

            newProduct.ProductId = products.Any() ? products.Max(p => p.ProductId) + 1 : 1;
            products.Add(newProduct);

            return CreatedAtAction(nameof(Get), new { id = newProduct.ProductId }, newProduct);
        }

        // PUT api/Products/5
        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] Product updatedProduct)
        {
            var existingProduct = products.FirstOrDefault(p => p.ProductId == id);
            if (existingProduct == null)
            {
                return NotFound($"Product with Id {id} not found.");
            }

            existingProduct.ProductName = updatedProduct.ProductName;
            existingProduct.Description = updatedProduct.Description;
            existingProduct.UnitPrice = updatedProduct.UnitPrice;
            existingProduct.ProductQuantity = updatedProduct.ProductQuantity;
            existingProduct.Discount = updatedProduct.Discount;
            existingProduct.CategoryId = updatedProduct.CategoryId;
            existingProduct.BrandId = updatedProduct.BrandId;

            return NoContent();
        }

        // DELETE api/Products/5
        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var product = products.FirstOrDefault(p => p.ProductId == id);
            if (product == null)
            {
                return NotFound($"Product with Id {id} not found.");
            }

            products.Remove(product);
            return NoContent();
        }
    }
}