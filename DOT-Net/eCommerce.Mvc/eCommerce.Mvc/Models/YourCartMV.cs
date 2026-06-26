namespace eCommerce.Mvc.Models;

public class YourCartVM
{
    public int CartId { get; set; }
    public DateTime CartDate { get; set; }
    public int CartItemId { get; set; }
    public string ProductName { get; set; } = string.Empty;
    public decimal UnitPrice { get; set; }
    public int Discount { get; set; }
    public string Picture { get; set; } = "~/Images/noimage.png";
    public int Quantity { get; set; }
    public string CategoryName { get; set; } = string.Empty;
}