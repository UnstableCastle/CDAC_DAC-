using eCommerce.Mvc.Models;
using eCommerce.Mvc.Repositories;
using Microsoft.AspNetCore.Mvc;

namespace   eCommerce.Mvc.Controllers;

public class CategoriesController : Controller
{
    private readonly ICommonRepository<Category> _catRepository;

    public CategoriesController(ICommonRepository<Category> catRepository)
    {
        _catRepository = catRepository;
    }

    public async Task<IActionResult> Index()
    {
        ViewData["PageTitle"] = "List Of Shoes Category!";
        var categories = await _catRepository.GetAllAsync();
        return View(categories);
    }
}
