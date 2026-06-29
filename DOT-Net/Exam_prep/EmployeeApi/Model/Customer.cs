using System.ComponentModel.DataAnnotations;

namespace eCommerce.Mvc.Models;

public class Customer
{
    public int CustomerId { get; set; }
    [MaxLength(100)]
    [Required(ErrorMessage = "Contact Name is a required field!")]
    public string ContactName { get; set; } = string.Empty;
    [MaxLength(100)]
    [Required(ErrorMessage = "Address is a required field!")]
    public string Address { get; set; } = string.Empty;
    [MaxLength(100)]
    [Required(ErrorMessage = "City is a required field!")]
    public string City { get; set; } = string.Empty;

    public ICollection<Cart>? Carts { get; set; }
}
