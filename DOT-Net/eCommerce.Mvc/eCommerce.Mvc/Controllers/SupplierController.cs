using eCommerce.Mvc.Dal;
using eCommerce.Mvc.Models; 
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Threading.Tasks;

namespace eCommerce.Mvc.Controllers
{
    public class SupplierController : Controller
    {
        private readonly eCommerceDbContext _context; 

        public SupplierController(eCommerceDbContext context)
        {
            _context = context;
        }

        public async Task<IActionResult> Index()
        {
            var suppliersList = await _context.Suppliers
                                              .Include(s => s.product)
                                              .ToListAsync();

            return View(suppliersList);
        }
    }
}