using System;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace eCommerceSample.Models;

public class Invoice
{
    [Key]
    public int InvoiceId { get; set; }

    public int CustomerId { get; set; }
    public Customer? Customer { get; set; }

    public int CartId { get; set; }
    public Cart? Cart { get; set; }

    [DisplayName("Date of Payment")]
    public DateTime InvoiceDay { get; set; }

    
    public double TotalPrice
    {
        get
        {
            if (Cart != null && Cart.CartItems != null)
            {
                double total = 0;
                foreach (var item in Cart.CartItems)
                {
                    total += (item.Quantity * item.Price);
                }
                return total;
            }
            return 0;
        }
    }
}