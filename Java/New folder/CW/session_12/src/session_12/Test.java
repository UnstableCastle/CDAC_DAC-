package session_12;
import java.util.*;
import java.util.stream.Collectors;
public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(222, "Rahul", 40000);
		Employee e2 = new Employee(111, "Priyanka", 60000);
		Employee e3 = new Employee(666, "Sayalee", 70000);
		Employee e4 = new Employee(444, "Nikita", 10000);
		Employee e5 = new Employee(333, "Sayalee", 20000);
		
	List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		long count = list.stream().count();
		System.out.println("Count = "+count);
		
	 List<Employee> l1 =
	list.stream().filter(i -> i.getEmpSal()>50000)
	.collect(Collectors.toList());
	 System.out.println(l1);
	
	System.out.println("------------");
	list.stream().filter(i -> i.getEmpSal()>50000)
	.collect(Collectors.toList())
	.forEach(System.out::println);
	
	System.out.println("-----------------");
	list.stream().filter(i -> i.getEmpSal()>50000)
	.map(Employee::getEmpName)
	.collect(Collectors.toList())
	.forEach(System.out::println);
	
	System.out.println("------------");
	Set<String> s = list.stream().map(Employee::getEmpName)
			.collect(Collectors.toSet());
	s.forEach(System.out::println);
	
	System.out.println("----------------");
	list.stream().sorted(Comparator.
			comparing(Employee::getEmpSal))
			.forEach(System.out::println);
	
	System.out.println("----------------");
	list.stream().sorted(Comparator.
			comparing(Employee::getEmpSal).
			reversed()).forEach(System.out::println);
	
	System.out.println("-------------");
	s.stream().sorted().forEach(System.out::println);
	
	Optional<Employee> o = list.stream()
			.min(Comparator.
					comparing(Employee::getEmpSal));
	System.out.println(o.get());
	
	
	System.out.println("--------------");
   long salSum = list.stream().map(Employee::getEmpSal)
		   .reduce(0L, Long::sum);
	System.out.println(salSum);
	
	System.out.println("------------------");
	Map<Integer,String> m = list.stream().
			collect(Collectors.
					toMap(Employee::getEmpId,
							Employee::getEmpName));
	System.out.println(m);
	}
}
