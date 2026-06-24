namespace eCommerce.Mvc.Models;

public class Supplier
{       
    public int SupplierId { get; set; }

    public string SupplierName { get; set; } = string.Empty;
    public string City { get; set;} = string.Empty;
    public int ProductId { get; set; }
    public Product? product { get; set; }


}
