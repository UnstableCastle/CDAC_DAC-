package A5;
import java.util.ArrayList;
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

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("\n--- Create Account ---");

                    System.out.print("Enter Account Number: ");
                    int accNo = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Account Type (1-Savings, 2-Current): ");
                    int type = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Opening Balance: ₹");
                    double balance = Double.parseDouble(sc.nextLine());

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
                    System.out.print("Enter Account Number: ");
                    int accNo2 = Integer.parseInt(sc.nextLine());

                    Account acc2 = findAccount(accounts, accNo2);

                    if (acc2 != null) {
                        acc2.displayDetails();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int accNo3 = Integer.parseInt(sc.nextLine());

                    Account acc3 = findAccount(accounts, accNo3);

                    if (acc3 != null) {
                        System.out.print("Enter deposit amount: ₹");
                        double amt = Double.parseDouble(sc.nextLine());
                        acc3.deposit(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int accNo4 = Integer.parseInt(sc.nextLine());

                    Account acc4 = findAccount(accounts, accNo4);

                    if (acc4 != null) {
                        System.out.print("Enter withdrawal amount: ₹");
                        double amt = Double.parseDouble(sc.nextLine());
                        acc4.withdraw(amt);
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
