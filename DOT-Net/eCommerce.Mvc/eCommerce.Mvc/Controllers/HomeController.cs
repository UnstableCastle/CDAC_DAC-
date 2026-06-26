using eCommerce.Mvc.Models;
using eCommerce.Mvc.Repositories;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Diagnostics;

namespace eCommerce.Mvc.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;
        private readonly ICommonRepository<Product> _productsRepository;

        public HomeController(ILogger<HomeController> logger, ICommonRepository<Product> productsRepository)
        {
            _logger = logger;
            _productsRepository = productsRepository;
        }

        
        public async Task<IActionResult> Index()
        {
            HttpContext.Session.SetInt32("CustomerId", 1);
            var products = await _productsRepository.GetAllAsync();
            ViewData["PageTitle"] = "Welcome To Products List!";
            return View(products);
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}