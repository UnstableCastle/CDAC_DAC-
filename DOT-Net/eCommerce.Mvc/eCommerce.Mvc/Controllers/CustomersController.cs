using Microsoft.AspNetCore.Mvc;

namespace   eCommerce.Mvc.Controllers;

public class CustomersController : Controller
{
    public IActionResult Index()
    {
        return View();
    }
}
