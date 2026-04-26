import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private String dept;

    public Employee(int empId, String empName, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "ID: " + empId + ", Name: '" + empName + "', Dept: '" + dept + "'";
    }
}

class MyStackEmp {
    private int top;
    private Employee[] emp;

    public MyStackEmp(int size) {
        this.top = -1;
        this.emp = new Employee[size];   
    }

    public boolean isFull() {
        return top == emp.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Employee employee) {
        if (isFull()) {
            System.out.println("Stack is Full! Overflow!!!");
        } else {
            emp[++top] = employee;
            System.out.println("Employee inserted successfully.");
        }
    }

    public Employee pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Underflow!!!");
            return null;
        } else {
            Employee deletedEmp = emp[top--];
            return deletedEmp;   
        }
    }

    public Employee peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        } else {
			return emp[top];
		}
	}
}

public class StackEmp {

    public static void main(String[] args) {
        char ch;
        MyStackEmp e = new MyStackEmp(8); 
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("\n--- Employee Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            ch = s.next().charAt(0);

            switch (ch) {
                case '1':
                    System.out.print("Enter Employee Id: ");
                    int empId = s.nextInt();
                    s.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String empName = s.nextLine();

                    System.out.print("Enter Employee Dept: ");
                    String dept = s.nextLine();

                    e.push(new Employee(empId, empName, dept));
                    break;

                case '2':
                    Employee removed = e.pop();
                    if (removed != null) {
                        System.out.println("Removed: " + removed.toString());
                    }
                    break;

                case '3':
                    Employee top = e.peek();
                    if (top != null) {
                        System.out.println("Top Element: " + top.toString());
                    }
                    break;

                case '4':
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != '4');

        s.close();
    }
}