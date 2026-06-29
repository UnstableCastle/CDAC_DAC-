namespace   eCommerce.Mvc.Models;

public class Invoice
{
    public int InvoiceId { get; set; }
    public DateTime InvoiceDate { get; set; }
    public int CartId { get; set; }
    public Cart Cart { get; set; }
}
