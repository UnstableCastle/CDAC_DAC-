using FirstMVCApp.Models;
using Microsoft.AspNetCore.Mvc;

namespace FirstMVCApp.Controllers;

public class CustomerController : Controller
{

    private readonly List<Customer> _customers;

    public CustomerController()
    {
        _customers = new List<Customer>() {

    new Customer() { CustomerId = 1, Name = "Alya", City = "Saint Petersburg" },
    new Customer() { CustomerId = 2, Name = "Jinno", City = "Kuala Lumpur" },
    new Customer() { CustomerId = 3, Name = "Rem", City = "Osaka" },
    new Customer() { CustomerId = 4, Name = "Naruto", City = "Tokyo" },
    new Customer() { CustomerId = 5, Name = "Sakura", City = "Kyoto" },
    new Customer() { CustomerId = 6, Name = "Luffy", City = "Fukuoka" },
    new Customer() { CustomerId = 7, Name = "Zoro", City = "Nagasaki" },
    new Customer() { CustomerId = 8, Name = "Nami", City = "Yokohama" },
    new Customer() { CustomerId = 9, Name = "Tanjiro", City = "Sapporo" },
    new Customer() { CustomerId = 10, Name = "Nezuko", City = "Kobe" }

          };
    }

    public IActionResult Index()
    {
        return View();
    }

    public IActionResult List()
    {

        return View(_customers);


    }
    public IActionResult Card()
    {

        return View(_customers);


    }
}
