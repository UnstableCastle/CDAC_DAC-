import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

    private static Account findAccount(ArrayList<Account> accounts, int accNo) {
        for (Account acc : accounts) {
            if (acc.accNo == accNo) {
                return acc;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n========== BANK MENU ==========");
            System.out.println("1. Create New Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Display Total Bank Deposits");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("\n--- Create Account ---");

                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Account Type (1-Savings, 2-Current): ");
                    int type = sc.nextInt();

                    System.out.print("Enter Opening Balance: ₹");
                    double balance = sc.nextDouble();

                    if (findAccount(accounts, accNo) != null) {
                        System.out.println("Account number already exists!");
                        break;
                    }

                    if (type == 1) {
                        if (balance >= 5000) {
                            accounts.add(new SavingsAccount(accNo, name, balance, branch));
                            System.out.println("Savings Account created!");
                        } else {
                            System.out.println("Minimum ₹5000 required.");
                        }
                    } else if (type == 2) {
                        if (balance >= 1000) {
                            accounts.add(new CurrentAccount(accNo, name, balance, branch));
                            System.out.println("Current Account created!");
                        } else {
                            System.out.println("Minimum ₹1000 required.");
                        }
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 2:
                case 3:
                case 4:
                    System.out.print("Enter Account Number: ");
                    int searchAcc = sc.nextInt();

                    Account acc = findAccount(accounts, searchAcc);

                    if (acc != null) {
                        if (choice == 2) {
                            acc.displayDetails();
                        } else if (choice == 3) {
                            System.out.print("Enter deposit amount: ₹");
                            double amt = sc.nextDouble();
                            acc.deposit(amt);
                        } else {
                            System.out.print("Enter withdrawal amount: ₹");
                            double amt = sc.nextDouble();
                            acc.withdraw(amt);
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    System.out.println("Total Bank Balance: ₹" + Account.totalMoney);
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
