import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;



public class EmpDetails {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Array list to store Students
		ArrayList<Employee_Payroll> s = new ArrayList<Employee_Payroll>();
		for (int i = 0; i <= 5; i++) {

			System.out.println("Enter Emp id");
			int empId = scanner.nextInt();
			System.out.println("Enter Emp Name");
			String empName = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Enter emp Desig");
			String empDesig = scanner.nextLine();
			System.out.println("Enter Salary");
			double salary = scanner.nextDouble();

			s.add(new Employee_Payroll(empId, empName, empDesig, salary));

		}
		System.out.println("============== All employees ================");

		for (Employee_Payroll a : s) {
			System.out.println(a);
		}

		System.out.println("============== sal>50K ================");
		s.stream().filter(i -> i.getSalary() > 50000).forEachOrdered(System.out::println);

		System.out.println("============== comparator ================");

		s.stream().sorted(Comparator.comparing(Employee_Payroll::getEmpDesig)).forEach(System.out::println);

		System.out.println("============== Map ================");
		Map<String, Double> m = s.stream().collect(Collectors.groupingBy(Employee_Payroll::getEmpDesig,Collectors.summingDouble(Employee_Payroll::getSalary)));
		System.out.println(m);
		
		
		System.out.println("============== compare with name ================");

		s.stream().sorted(Comparator.comparing(Employee_Payroll::getEmpName)).forEach(System.out::println);
		
		
		scanner.close();
	
	}

	
}
