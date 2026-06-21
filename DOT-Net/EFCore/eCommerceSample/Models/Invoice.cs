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

    public int CartId { get; set; } // Fixed spelling from 'Cartid' to 'CartId' to explicitly map relationship
    public Cart? Cart { get; set; }

    [DisplayName("Date of Payment")]
    public DateTime InvoiceDay { get; set; } // Fixed minor spelling typo from InvoceDay
}