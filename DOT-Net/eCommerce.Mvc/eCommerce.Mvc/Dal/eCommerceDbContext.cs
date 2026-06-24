using eCommerce.Mvc.Models;
using Microsoft.EntityFrameworkCore;

namespace eCommerce.Mvc.Dal;

public class eCommerceDbContext : DbContext
{
    public eCommerceDbContext()
    {
        
    }
    public eCommerceDbContext(DbContextOptions<eCommerceDbContext> options):base(options) 
    { 

    }
    public DbSet<Category> Categories { get; set; }
    public DbSet<Product> Products { get; set; }
    public DbSet<Customer> Customers { get; set; }
    public DbSet<Cart> Carts { get; set; }
    public DbSet<CartItem> CartItems { get; set; }
    public DbSet<Invoice> Invoices { get; set; }
    public DbSet<Supplier> Suppliers { get; set; }
    public DbSet<Shipper> Shippers { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            optionsBuilder.UseMySQL("Server=localhost;Port=3306;Database=Ecom;User Id=root;Password=1234;");
           //optionsBuilder.UseSqlServer("Server=(localdb)\\MSSQLLocalDB;Database=MSSqlEComDb;Trusted_Connection=True;TrustServerCertificate=True;");
        }
    }

}
