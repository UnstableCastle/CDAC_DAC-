import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCRUD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Element");
            System.out.println("2. Display Elements");
            System.out.println("3. Update Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter element to add: ");
                    String addElement = sc.nextLine();
                    list.add(addElement);
                    System.out.println("Added successfully!");
                    break;

                case 2:
                    System.out.println("\nList Elements:");
                    if (list.isEmpty()) {
                        System.out.println("List is empty!");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(i + " : " + list.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    if (updateIndex >= 0 && updateIndex < list.size()) {
                        System.out.print("Enter new value: ");
                        String newValue = sc.nextLine();
                        list.set(updateIndex, newValue);
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex >= 0 && deleteIndex < list.size()) {
                        list.remove(deleteIndex);
                        System.out.println("Deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}


//import java.util.ArrayList;
//import java.util.*;
//public class ArrayListCRUD {
//
//	public static void main(String[] args) {
//		Scanner s  = new Scanner(System.in);
//		ArrayList<String> a = new ArrayList<String>();
//
//		// ADD
//		System.out.println("ADD\n");
//		a.add("CASTLE");
//		a.add("Strelzia");
//		a.add("Rio");
//		a.add("Light");
//		a.add("Winchester");
//		System.out.println(a);
//
//		System.out.println("\nDisplay");
//		System.out.println();
//		// DISPLAY
//		for (String s : a) {
//			System.out.println(s);
//		}
//		System.out.println("\nUpdate\n");
//		// UPDATE
//		a.set(3, "Strix");
//		System.out.println(a);
//
//		// Delete
//		System.out.println("\nDelete\n");
//		a.remove(3);
//		System.out.println(a);
//		
//		
//		
//		
//
//	}
//}