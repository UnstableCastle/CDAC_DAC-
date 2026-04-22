import java.util.*;
import java.util.stream.Collectors;

public class Book {

	private String ISBN;
	String title;
	String author;
	int copies;

	public Book() {
	}

	public Book(String iSBN, String title, String author, int copies) {
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.copies = copies;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", copies=" + copies + "]\n";
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		HashMap<String, Book> books = new HashMap<>();

		books.put("I001", new Book("I001", "The Alchemist", "Paulo Coelho", 5));
		books.put("I002", new Book("I002", "1984", "George Orwell", 3));
		books.put("I003", new Book("I003", "To Kill a Mockingbird", "Harper Lee", 4));
		books.put("I004", new Book("I004", "The Great Gatsby", "F. Scott Fitzgerald", 2));
		books.put("I005", new Book("I005", "Moby Dick", "Herman Melville", 6));
		books.put("I006", new Book("I006", "Pride and Prejudice", "Jane Austen", 3));
		books.put("I007", new Book("I007", "Harry Potter", "J.K. Rowling", 7));

		Map<String, Queue<String>> waitingQueues = new HashMap<>();
//		books.keySet().forEach(k -> waitingQueues.put(k, new LinkedList<>()));

		int choice;

		do {
			System.out.println("\n===== Library Menu =====");
			System.out.println("1. Search Book");
			System.out.println("2. Display Sorted Books");
			System.out.println("3. Borrow Book");
			System.out.println("4. Show Waiting List");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			choice = s.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter ISBN:");
				String id = s.next();

				Book found = books.get(id);
				if (found != null)
					System.out.println(found);
				else
					System.out.println("Book not found");
				break;

			case 2:
				System.out.println("\n--- Books Sorted by Title ---");
				TreeSet<Book> t = new TreeSet<>(Comparator.comparing(Book::getTitle));
				t.addAll(books.values());
				t.forEach(System.out::println);
				break;

			case 3:
				System.out.println("Enter ISBN to borrow:");
				String borrowId = s.next();

				Book b = books.get(borrowId);

				if (b != null) {
					System.out.println("Enter user name:");
					String user = s.next();

					if (b.getCopies() > 0) {
						b.setCopies(b.getCopies() - 1);
						System.out.println(user + " borrowed the book");
					} else {
						waitingQueues.get(borrowId).offer(user);
						System.out.println("No copies ,added to waiting list");
					}
				} else {
					System.out.println("Book not found");
				}
				break;

			case 4:
				System.out.println("\n===== Waiting Lists =====");

				waitingQueues.entrySet().stream().filter(entry -> !entry.getValue().isEmpty()).forEach(entry -> {
					Book book = books.get(entry.getKey());
					System.out.println("Book: " + book.getTitle());
					System.out.println("Waiting: " + entry.getValue().stream().collect(Collectors.joining(", ")));
				});
				break;

			case 5:
				System.out.println("Exiting... ");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		s.close();
	}
}
