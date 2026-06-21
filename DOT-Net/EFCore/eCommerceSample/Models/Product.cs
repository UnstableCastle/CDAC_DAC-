using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace eCommerceSample.Models;

public class Product
{
    [Key]
    public int ProductId { get; set; }

    [Required(ErrorMessage = "This is a Required Field")]
    [DisplayName("Product Name")]
    [MaxLength(100, ErrorMessage = "Product Name must not exceed 100 char")]
    public string ProductName { get; set; } = string.Empty;

    [Required(ErrorMessage = "This is a required field")]
    [DisplayName("Product description")]
    [MaxLength(100, ErrorMessage = "Product description must not exceed 100 char")] 
    public string ProductDescription { get; set; } = string.Empty;

    [Required(ErrorMessage = "This is a Required Field")]
    public int CategoryID { get; set; }
    public Category? Category { get; set; }

    public int UnitPrice { get; set; }

    public bool? IsBlackListed { get; set; } 

    public int Quantity { get; set; }

    public ICollection<CartItem>? CartItems { get; set; }
}