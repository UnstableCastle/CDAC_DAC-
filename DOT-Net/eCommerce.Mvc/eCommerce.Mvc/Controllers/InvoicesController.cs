using Microsoft.AspNetCore.Mvc;

namespace eCommerce.Mvc.Controllers;

public class InvoicesController : Controller
{
    public IActionResult Index()
    {
        return View();
    }
}
