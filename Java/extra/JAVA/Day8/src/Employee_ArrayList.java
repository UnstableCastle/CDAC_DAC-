import java.util.*;

public class Employee_ArrayList {

	public static void main(String[] args) {
		int n;

		ArrayList<Employee> a = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("Enter the Number of Employees you want to insert : ");
		n = s.nextInt();
		Employee e[] = new Employee[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter details for Employee :" + (i + 1));
			System.out.println("Enter Employee Id : ");
			int empId = s.nextInt();

			System.out.println("Enter Employee Name :");
			String name = s.next();

			System.out.println("Enter Employee Sal : ");
			int sal = s.nextInt();

			e[i] = new Employee(empId, name, sal);
			
			a.add(e[i]);

		}
//	
//	 e[0] = new Employee(1,"a",100);
//	 e[1] = new Employee(2,"b",200);
//	 e[2] = new Employee(3,"c",300);
//	 e[3] = new Employee(4,"d",400);
//	
//		a.add(e[0]);
//		a.add(e[1]);
//		a.add(e[2]);
//		a.add(e[3]);
		System.out.println(a);
		
		

		a.set(3, new Employee(5, "aaa", 200));
		System.out.println(a);
		try{a.remove(3);}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		System.out.println(a);
	}
}
