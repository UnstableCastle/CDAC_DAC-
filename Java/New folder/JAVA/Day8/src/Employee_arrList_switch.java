import java.util.*;

public class Employee_arrList_switch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Employee> a = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = s.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String name = s.next();

                    System.out.print("Enter Employee Salary: ");
                    int sal = s.nextInt();

                    a.add(new Employee(empId, name, sal));
                    System.out.println("Employee Added!");
                    break;

                case 2:
                    if (a.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\nEmployee List:");
                        for (int i = 0; i < a.size(); i++) {
                            System.out.println(i + " -> " + a.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index to update: ");
                    int index = s.nextInt();

                    if (index >= 0 && index < a.size()) {
                        System.out.print("Enter new ID: ");
                        int newId = s.nextInt();

                        System.out.print("Enter new Name: ");
                        String newName = s.next();

                        System.out.print("Enter new Salary: ");
                        int newSal = s.nextInt();

                        a.set(index, new Employee(newId, newName, newSal));
                        System.out.println("Employee Updated!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = s.nextInt();

                    if (removeIndex >= 0 && removeIndex < a.size()) {
                        a.remove(removeIndex);
                        System.out.println("Employee Removed!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... ");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        s.close();
    }
}
