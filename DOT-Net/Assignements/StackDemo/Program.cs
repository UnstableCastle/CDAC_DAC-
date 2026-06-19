namespace StackDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("stack demo");

            Stack<Books> books = new Stack<Books>();
            books.Push(new Books() {id=1,title= "Harry Potter & The Philosopher's stone", author="J K Rowling",price=1000 });
            books.Push(new Books() {id=1,title="Harry Potter & The Chambers Of Secret",author="J K Rowling",price=1000 });
            books.Push(new Books() {id=1,title="Harry Potter & The Priznor of Askaban",author="J K Rowling",price=1000 });

            foreach (Books book in books)
            {
                Console.WriteLine(book);
            }
    }
}
}
