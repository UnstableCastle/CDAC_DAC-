using eCommerceSample.Dal;
using eCommerceSample.Models;
using System;
using System.Linq;

namespace eCommerceSample;

internal class Program
{
    static void Main(string[] args)
    {
        using eCommerceDbContext dbContext = new eCommerceDbContext();

     
        var currentCustomer = dbContext.Customers.FirstOrDefault();
        var currentProduct = dbContext.Products.FirstOrDefault();

        if (currentCustomer == null || currentProduct == null)
        {
            Console.WriteLine("Please ensure you have at least one Customer and one Product in the database first.");
            return;
        }

    
        Cart cart = new Cart();
        cart.CustomerId = currentCustomer.CustomerId;
        cart.CreatedOn = DateTime.Now;
        dbContext.Carts.Add(cart);
        dbContext.SaveChanges();

        
        CartItem item = new CartItem();
        item.CartId = cart.CartId;
        item.ProductId = currentProduct.ProductId;
        item.Quantity = 3;        
        item.Price = 1500.00;   
        item.CartName = "My Simple Order";
        dbContext.CartItems.Add(item);
        dbContext.SaveChanges();

       
        Invoice invoice = new Invoice();
        invoice.CustomerId = currentCustomer.CustomerId;
        invoice.CartId = cart.CartId;
        invoice.InvoiceDay = DateTime.Now;
        dbContext.Invoices.Add(invoice);
        dbContext.SaveChanges();

        Console.WriteLine("Invoice Generated Successfully!\n");

      

        
        var dbInvoice = dbContext.Invoices.FirstOrDefault(i => i.InvoiceId == invoice.InvoiceId);

    
        var dbCartItem = dbContext.CartItems.FirstOrDefault(ci => ci.CartId == cart.CartId);
        var dbProduct = dbContext.Products.FirstOrDefault(p => p.ProductId == dbCartItem.ProductId);

        Console.WriteLine("=================================");
        Console.WriteLine("         INVOICE DETAILS         ");
        Console.WriteLine("=================================");
        Console.WriteLine($"Invoice Number : {dbInvoice.InvoiceId}");
        Console.WriteLine($"Customer ID    : {dbInvoice.CustomerId}");
        Console.WriteLine($"Product Name   : {dbProduct.ProductName}");
        Console.WriteLine($"Quantity       : {dbCartItem.Quantity}");
        Console.WriteLine($"Unit Price     : {dbCartItem.Price}");
        Console.WriteLine("---------------------------------");

      
        double calculatedTotal = dbCartItem.Quantity * dbCartItem.Price;
        Console.WriteLine($"TOTAL PRICE    : {calculatedTotal}");
        Console.WriteLine("=================================");
    }
}