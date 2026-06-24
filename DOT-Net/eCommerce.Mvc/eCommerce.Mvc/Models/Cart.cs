namespace eCommerce.Mvc.Models;

public class Cart
{
    public int CartId { get; set; }
    public DateTime CartDate { get; set; }
    public int? CustomerId { get; set; }
    public ICollection<CartItem> CartItems { get; set; }
    public Invoice Invoice { get; set; }
}
