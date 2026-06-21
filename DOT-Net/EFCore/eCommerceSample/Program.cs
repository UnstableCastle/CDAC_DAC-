using eCommerceSample.Dal;

namespace eCommerceSample;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("EF Core CRUD Operations!");
        eCommerceDbContext dbContext = new eCommerceDbContext();
        var catgeories = from cat in dbContext.Categories
                         select cat;
        foreach (var category in catgeories)
        {
            Console.WriteLine($"Category {category.CategoryName} and its description is {category.CategoryDescription}!");
        }
       
    }
}