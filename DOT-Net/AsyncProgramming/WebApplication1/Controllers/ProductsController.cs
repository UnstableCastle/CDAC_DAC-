using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class ProductsController : Controller
    {
        public IActionResult Index()
        {

            var product = new Product()
            {
                id = 1,
                name="Laptop"

            };


            ViewBag.Message = "view bag message";
            ViewData["Name"] = "From View Data";
            TempData["Success"] = "from temp data";



            return View(product);
        }




        public IActionResult Save()
        {
            TempData["Success"] = "Prodcut Saved";
            return RedirectToAction("One");
        }

        public IActionResult One() { 
        
        return View();
        
        }
}
}
