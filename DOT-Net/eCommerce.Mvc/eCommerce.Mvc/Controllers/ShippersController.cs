using eCommerce.Mvc.Dal;
using eCommerce.Mvc.Models; 
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Threading.Tasks;

namespace eCommerce.Mvc.Controllers
{
    public class ShipperController : Controller
    {
        private readonly eCommerceDbContext _context; 

      
        public ShipperController(eCommerceDbContext context)
        {
            _context = context;
        }

        public async Task<IActionResult> Index()
        {
            
            var shippersList = await _context.Shippers.ToListAsync();

       
            return View(shippersList);
        }
    }
}