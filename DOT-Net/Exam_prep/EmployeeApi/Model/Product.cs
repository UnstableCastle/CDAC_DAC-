using System.ComponentModel.DataAnnotations;

namespace eCommerce.Mvc.Models;

public class Product
{
    [Key]
    public int ProductId { get; set; }
    public int BrandId { get; set; }
    public int CategoryId { get; set; }
    [MaxLength(100)]
    [Required(ErrorMessage = "Product Name is a required field!")]
    public string ProductName { get; set; } = string.Empty;
    [Required(ErrorMessage = "Product Name is a required field!")]
    [MaxLength(500)]
    public string Description { get; set; } = string.Empty;
    public decimal UnitPrice { get; set; }
    
    public DateTime ManufacturingDate { get; set; }
    public string MadeIn { get; set; } = "India";
    public string Gender { get; set; } = string.Empty;
    public string WarrantyPeriod { get; set; } = "1-Year";
    public string ReturnPolicy { get; set; } = "15-Days";
    [Range(1, 10, ErrorMessage = "Quantity must be between 1-10")]
    public int ProductQuantity { get; set; } = 1;
    public int Discount { get; set; }
    public string Picture { get; set; } = "~/Images/noimage.png";
    public Category Category { get; set; }
}
