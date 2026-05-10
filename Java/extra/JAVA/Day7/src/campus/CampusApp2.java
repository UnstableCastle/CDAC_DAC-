package campus;

import java.util.Scanner;
import java.util.Date;
import campus.academics.Student;
import campus.accounts.Fees;

public class CampusApp2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[4];
        Fees[] f = new Fees[4];

        for (int i = 0; i < 4; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();
            
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();
            sc.nextLine();

            s[i] = new Student(name, age, address,branch, roll, sem);

            System.out.print("Enter Fees Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            f[i] = new Fees(s[i], amount, new Date());
        }

        double total = 0;

        System.out.println("\n--- Fees Details ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(f[i]);
            total += f[i].getAmount();
        }

        System.out.println("\nTotal Fees Collected: " + total);

        sc.close();
    }
}
