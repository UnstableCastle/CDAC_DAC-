package session_10;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
public class Test {
	public static void main(String[] args) {
		Employee e1 = 
				new Employee(222, "Rahul", 46734.78f);
		Employee e2 = new Employee(111, "Sayalee", 46734.78f);
		Employee e3 = new Employee(555, "Nikita", 46734.78f);
		Employee e4 = new Employee(444, "Aryan", 46734.78f);
		Employee e5 = new Employee(333, "Rahul", 46734.78f);
	
		Comparator<Employee> c = 
			Comparator.comparing(Employee::getEmpName).
			thenComparing(Employee::getEmpId);
		
		//TreeSet<Employee> t = new TreeSet<Employee>();
		/*
		 * TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator());
		 */
		//ArrayList<Employee> t = new ArrayList<Employee>();
		TreeSet<Employee> t = new TreeSet<Employee>(c);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		/*
		 * Collections.sort(t); System.out.println(t);
		 * 
		 * System.out.println("Name:"); Collections.sort(t,new MyComparator());
		 * System.out.println(t);
		 */
		
		
		 System.out.println("----------");
		 t.stream().sorted().forEach(System.out::println);
		 System.out.println("----------");
		 t.stream().sorted(new MyComparator()).forEach(System.out::println);
		
	}

}
