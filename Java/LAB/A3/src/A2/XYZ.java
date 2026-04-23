package A2;
import java.util.*;

public class XYZ {

	public static double calculateTotalAmount(Product[] products) {
		double totalAmount = 0;
		for (Product p : products) {
			totalAmount += (p.price * p.quantity);
		}
		return totalAmount;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product[] products = new Product[5];

		System.out.println("Enter information for 5 products:");
		for (int i = 0; i < 5; i++) {
			
			System.out.println("\nProduct " + (i + 1) + ":");
			System.out.print("Enter Product ID: ");
			int pid = scanner.nextInt();
			
			System.out.print("Enter Price: ");
			double price = scanner.nextDouble();
			
			System.out.print("Enter Quantity: ");
			int quantity = scanner.nextInt();

			products[i] = new Product(pid, price, quantity);
		}

		double maxPrice = products[0].price;
		int maxPid = products[0].pid;

		for (int i = 1; i < products.length; i++) {
			if (products[i].price > maxPrice) {
				maxPrice = products[i].price;
				maxPid = products[i].pid;
			}
		}
		System.out.println("\n--- Results ---");
	
		System.out.println("Product ID with the highest price is: " + maxPid + " (Price: " + maxPrice + ")");

		double totalSpent = calculateTotalAmount(products);
		
		System.out.println("Total amount spent on all products: " + totalSpent);

		scanner.close();
	}
}