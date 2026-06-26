using eCommerce.Mvc.Models;
using eCommerce.Mvc.Repositories;
using Microsoft.AspNetCore.Mvc;

namespace eCommerce.Mvc.Controllers;


public class CartsController : Controller
{
    private readonly ICommonRepository<Cart> _cartRepository;
    private readonly ICommonRepository<CartItem> _cartItemRepository;
    private readonly ICartView _cartView;
    public CartsController(ICommonRepository<Cart> cartRepository, ICommonRepository<CartItem> cartItemRepository, ICartView cartView)
    {
        _cartRepository = cartRepository;
        _cartItemRepository = cartItemRepository;
        _cartView = cartView;
    }

    public IActionResult Index()
    {
        return View();
    }
    public async Task<IActionResult> AddToCart(int productId)
    {
        if (HttpContext.Session.GetInt32("CartId") == null)
        {
            Cart cart = new Cart() { CartDate = DateTime.Now, CustomerId = HttpContext.Session.GetInt32("CustomerId") };
            int result = await _cartRepository.InsertAsync(cart);
            if (result > 0)
            {
                HttpContext.Session.SetInt32("CartId", cart.CartId);
            }
        }
        CartItem cartItem = new CartItem()
        {
            CartId = Convert.ToInt32(HttpContext.Session.GetInt32("CartId")),
            ProductId = productId,
            Quantity = 1
        };
        var cartItemsResult = await _cartItemRepository.InsertAsync(cartItem);
        if (cartItemsResult > 0)
        {
            return RedirectToAction("YourCart");
        }
        return View();
    }
    public async Task<IActionResult> YourCart()
    {
        var cartItems = await _cartView.GetYourCart(Convert.ToInt32(HttpContext.Session.GetInt32("CartId")));
        return View("YourCart", cartItems);
    }
}