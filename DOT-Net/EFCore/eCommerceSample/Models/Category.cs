using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace eCommerceSample.Models;

public class Category
{
    [Key]
    public int CategoryID { get; set; }

    [Required(ErrorMessage = "This is a required Field")]
    [DisplayName("Category Name")]
    [MaxLength(100, ErrorMessage = "Category Name can't exceed 100 Char")]
    public string CategoryName { get; set; } = string.Empty;

    [Required(ErrorMessage = "This is a required Field")]
    [DisplayName("Category Description")]
    [MaxLength(100, ErrorMessage = "Category Description can't exceed 100 Char")]
    public string CategoryDescription { get; set; } = string.Empty;

    public List<Product>? Products { get; set; }
}