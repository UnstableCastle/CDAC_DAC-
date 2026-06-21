using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace eCommerceSample.Models;

public class CartItem
{
    [Key]
    public int CartItemId { get; set; }

    [DisplayName("Cart Name")]
    [Required(ErrorMessage = "This is a required Field")]
    public string CartName { get; set; } = string.Empty;

    public int CartId { get; set; }
    public Cart? Cart { get; set; }

    public int ProductId { get; set; }
    public Product? Product { get; set; }

    public int Quantity { get; set; }

    public double Price { get; set; }
}