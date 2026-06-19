
namespace StackDemo;

internal class Books
{
    public int id {  get; set; }
    public string? title { get; set; }
    public string? author { get; set; }

    public double? price { get; set; }


    public override string ToString()
    {
        return $"ID: {id} | Title: {title} | Author: {author} | Price: ${price}";
    }
}
