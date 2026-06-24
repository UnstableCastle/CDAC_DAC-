using System.ComponentModel.DataAnnotations;

namespace eCommerce.Mvc.Models;

public class Category
{
    public int CategoryId { get; set; }
    [MaxLength(100)]
    [Required(ErrorMessage = "Category Name is a required field!")]
    public string CategoryName { get; set; } = string.Empty;
    [MaxLength(400)]
    [Required(ErrorMessage = "Category Description is a required field!")]
    public string CategoryDescription { get; set; } = string.Empty;

    public ICollection<Product>? Products { get; set; }
}
