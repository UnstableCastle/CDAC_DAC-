import java.util.*;

public class Table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int table;
		System.out.println("enter num to display table");
		a = s.nextInt();

		for (int i = 1; i <= 10; i++) {

			table = a * i;
			System.out.println(a+"*"+i+"="+table);

		}

	}
}
