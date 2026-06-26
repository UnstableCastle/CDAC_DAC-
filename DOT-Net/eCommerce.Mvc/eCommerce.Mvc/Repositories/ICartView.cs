using eCommerce.Mvc.Models;

namespace eCommerce.Mvc.Repositories
{
    public interface ICartView
    {
        Task<List<YourCartVM>> GetYourCart(int cartId);

    }
}
