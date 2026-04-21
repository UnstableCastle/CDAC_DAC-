import java.util.HashMap;
import java.util.*;
public class Book {

	private String ISBN;
	String title;
	String author;
	int copies;
	
	public Book() {
		}

	public Book(String iSBN, String title, String author, int copies) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.copies = copies;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", copies=" + copies + "]"+"\n";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Book> books = new HashMap<String, Book>();

		books.put("I001", new Book("I001", "The Alchemist", "Paulo Coelho", 5));
		books.put("I002", new Book("I002", "1984", "George Orwell", 3));
		books.put("I003", new Book("I003", "To Kill a Mockingbird", "Harper Lee", 4));
		books.put("I004", new Book("I004", "The Great Gatsby", "F. Scott Fitzgerald", 2));
		books.put("I005", new Book("I005", "Moby Dick", "Herman Melville", 6));
		books.put("I006", new Book("I006", "Pride and Prejudice", "Jane Austen", 3));
		books.put("I007", new Book("I007", "Harry Potter", "J.K. Rowling", 7));

		System.out.println(books);
		System.out.println( );
		
		
		
	System.out.println("Enter ISBN to Find Book");
	String id = s.next();
	books.values().stream().filter(z ->z.ISBN.equals(id)).forEach(System.out::println);
		
	
	System.out.println("======================Books Sorted Via Title========================");
	
	TreeSet<Book> t = new TreeSet<Book>(Comparator.comparing(Book::getTitle));
	t.addAll(books.values());
	System.out.println(t);
		
	
	System.out.println("====================== Add user to Queue ========================");
	
		
	
	
	}
	
	
}
