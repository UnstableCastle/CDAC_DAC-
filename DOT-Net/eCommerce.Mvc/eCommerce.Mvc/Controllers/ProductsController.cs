using eCommerce.Mvc.Models;
using eCommerce.Mvc.Repositories;
using Microsoft.AspNetCore.Mvc;

namespace eCommerce.Mvc.Controllers;

public class ProductsController : Controller
{
    private readonly ICommonRepository<Product> _productsRepository;

    public ProductsController(ICommonRepository<Product> productsRepository)
    {
        _productsRepository = productsRepository;
    }

    public async Task<IActionResult> Index()
    {
        var products = await _productsRepository.GetAllAsync();
        ViewData["PageTitle"] = "Welcome To Products List!";
        return View(products);
    }
    public async Task<IActionResult> CatWiseProducts(int categoryId)
    {
        var products = await _productsRepository.GetAllAsync();
        ViewData["PageTitle"] = "Welcome To Products List!";
        return View("Index",products.Where(p=>p.CategoryId==categoryId));
    }
    public async Task<IActionResult> Details(int id)
    {
        var product = await _productsRepository.GetDetailsAsync(id);
        return View(product);
    }
}
