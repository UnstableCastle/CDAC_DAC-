using Org.BouncyCastle.Asn1.Cmp;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Text;

namespace eCommerceSample.Models;

public class Customer
{
    [Key]
    public int CustomerId { get; set; }


    [Required (ErrorMessage ="This is a requird field")]
    [DisplayName("Customer Name")]
    [MaxLength(100,ErrorMessage ="Name can't execeed 100 chars")]
    public string CustomerName  {  get; set;}= string.Empty;



    [Required(ErrorMessage = "This is a requird field")]
    [DisplayName("Contact Number")]
    [MaxLength(10, ErrorMessage = "Number must be 10 digits")]
    [MinLength(10, ErrorMessage = "Number must be 10 digits")]
    public string ContactNumber { get; set; } = string.Empty;

    [Required(ErrorMessage = "This is a requird field")]
    [DisplayName("Address")]
    public string Address { get; set; }= string.Empty;


    [Required(ErrorMessage = "This is a requird field")]
    [DisplayName("Email")]
    [EmailAddress(ErrorMessage ="Enter valid email")]
    public string Email {  get; set; }= string.Empty;

    public ICollection<Cart>? Carts { get; set; }




}
