using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace eCommerceSample.Models;

public class Cart
{
    [Key]
    public int CartId { get; set; } 

    public int CustomerId { get; set; }
    public Customer? Customer { get; set; }

    public DateTime CreatedOn { get; set; }

    public ICollection<CartItem>? CartItems { get; set; }

    public Invoice? Invoice { get; set; }
}