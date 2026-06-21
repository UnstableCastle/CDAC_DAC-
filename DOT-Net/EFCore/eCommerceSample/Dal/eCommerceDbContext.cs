using eCommerceSample.Models;
using Microsoft.EntityFrameworkCore;

namespace eCommerceSample.Dal;

public class eCommerceDbContext : DbContext
{
    public eCommerceDbContext() { }

    public eCommerceDbContext(DbContextOptions<eCommerceDbContext> options) : base(options) { }

    public DbSet<Category> Categories { get; set; }
    public DbSet<Product> Products { get; set; }
    public DbSet<Customer> Customers { get; set; }
    public DbSet<Cart> Carts { get; set; }
    public DbSet<CartItem> CartItems { get; set; }
    public DbSet<Invoice> Invoices { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            optionsBuilder.UseMySQL("server=localhost;port=3306;database=eComm;user=root;password=1234");
        }
    }

    
}