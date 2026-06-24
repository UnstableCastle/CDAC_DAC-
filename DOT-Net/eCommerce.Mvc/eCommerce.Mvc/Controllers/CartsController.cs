using Microsoft.AspNetCore.Mvc;

namespace eCommerce.Mvc.Controllers;

public class CartsController : Controller
{
    public IActionResult Index()
    {
        return View();
    }
}
