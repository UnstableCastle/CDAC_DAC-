using eCommerce.Mvc.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;

namespace eCommerce.Mvc.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CategoriesController : ControllerBase
    {
        private static List<Category> categories = new List<Category>
        {
            new Category { CategoryId = 1, CategoryName = "Electronics", CategoryDescription = "Gadgets and devices" },
            new Category { CategoryId = 2, CategoryName = "Audio", CategoryDescription = "Headphones and speakers" }
        };

        // GET: api/Categories
        [HttpGet]
        public ActionResult<IEnumerable<Category>> Get()
        {
            return Ok(categories);
        }

        // GET api/Categories/5
        [HttpGet("{id}")]
        public ActionResult<Category> Get(int id)
        {
            var category = categories.FirstOrDefault(c => c.CategoryId == id);
            if (category == null)
            {
                return NotFound($"Category with Id {id} not found.");
            }
            return Ok(category);
        }

        // POST api/Categories
        [HttpPost]
        public ActionResult<Category> Post([FromBody] Category newCategory)
        {
            if (newCategory == null)
            {
                return BadRequest("Invalid category data.");
            }

            newCategory.CategoryId = categories.Any() ? categories.Max(c => c.CategoryId) + 1 : 1;
            categories.Add(newCategory);

            return CreatedAtAction(nameof(Get), new { id = newCategory.CategoryId }, newCategory);
        }

        // PUT api/Categories/5
        [HttpPut("{id}")]
        public IActionResult Put(int id, [FromBody] Category updatedCategory)
        {
            var existingCategory = categories.FirstOrDefault(c => c.CategoryId == id);
            if (existingCategory == null)
            {
                return NotFound($"Category with Id {id} not found.");
            }

            existingCategory.CategoryName = updatedCategory.CategoryName;
            existingCategory.CategoryDescription = updatedCategory.CategoryDescription;

            return NoContent();
        }

        // DELETE api/Categories/5
        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var category = categories.FirstOrDefault(c => c.CategoryId == id);
            if (category == null)
            {
                return NotFound($"Category with Id {id} not found.");
            }

            categories.Remove(category);
            return NoContent();
        }
    }
}