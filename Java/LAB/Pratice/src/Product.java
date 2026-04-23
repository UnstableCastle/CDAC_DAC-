import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Product {
	private int pid;
	private String name;
	private Double price;

	public Product() {
	}

	public Product(int pid, String name, Double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "  \tProduct [pid=" + pid + ", name=" + name + ", price=" + price + "]" + "\n";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<Integer, Product> h = new HashMap<Integer, Product>();

		h.put(1, new Product(1, "cake", 120d));
		h.put(2, new Product(2, "ice-cream", 120d));
		h.put(3, new Product(3, "Kurkure", 20d));
		h.put(4, new Product(4, "Lays", 20d));
		h.put(5, new Product(5, "Biscuits", 120d));

		System.out.println("===========Menu============");
		System.out.println(h);

		System.out.println("====Cart========");

		System.out.println("number of products to cart");
		int y = s.nextInt();

		List<Product> cart = new ArrayList<>();

		
		
		for (int i = 0; i < y; i++) {
			System.out.println("Enter Product id :");
			int n = s.nextInt();

			h.values().stream().filter(p -> p.getPid() == n).findFirst().ifPresent(p -> {
				cart.add(p);
				System.out.println("Added: " + p);
			});

			System.out.println("\n==== YOUR CART ====");

			for (Product p : cart) {
				System.out.println(p);
			}

			 System.out.println("==== CART ====");
             cart.forEach(System.out::println);

             double total = cart.stream().mapToDouble(Product::getPrice).sum();

             System.out.println("Total: " + total);
			
		}
	}
}
