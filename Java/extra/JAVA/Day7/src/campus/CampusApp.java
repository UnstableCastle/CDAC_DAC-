package campus;

import java.util.Scanner;
import campus.academics.Faculty;

public class CampusApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Faculty[] f = new Faculty[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter details for Faculty " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            
            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Faculty ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();

            f[i] = new Faculty(name, age, address, id, salary, branch);
        }
        
        for (int i = 0; i < 5; i++) {
        	System.out.println(f[i]);
        }
        
        double total = 0;
        for (Faculty x : f) {
            total += x.salary;
        }

        System.out.println("\nTotal Salary: " + total);

        sc.close();
    }
}
