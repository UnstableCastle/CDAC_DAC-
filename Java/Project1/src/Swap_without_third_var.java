import java.util.*;

public class Swap_without_third_var {

	public static void main(String[] args) {
		int a, b, c;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value for A B:");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Value for A before swap:"+a);
		System.out.println("Value for B before swap:"+b);
		
		a = a + b; // (a now holds the total sum)
		b = a - b; // (b now holds the original a)
		a = a - b;
		System.out.println("Value for A before swap:"+a);
		System.out.println("Value for B before swap:"+b);
		
	}

}
