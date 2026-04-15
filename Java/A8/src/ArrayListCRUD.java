import java.util.ArrayList;

public class ArrayListCRUD {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		// ADD
		System.out.println("ADD\n");
		a.add("CASTLE");
		a.add("Strelzia");
		a.add("Rio");
		a.add("Light");
		a.add("Winchester");
		System.out.println(a);

		System.out.println("\nDisplay");
		System.out.println();
		// DISPLAY
		for (String s : a) {
			System.out.println(s);
		}
		System.out.println("\nUpdate\n");
		// UPDATE
		a.set(3, "Strix");
		System.out.println(a);

		// Delete
		System.out.println("\nDelete\n");
		a.remove(3);
		System.out.println(a);
		
		

	}
}