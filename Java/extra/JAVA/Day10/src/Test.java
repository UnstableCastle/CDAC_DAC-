import java.util.TreeSet;
public class Test {
	
	public static void main(String[] args)throws ClassCastException {
		
		Employee e1 = new Employee(222,"aaa",290993.3f);
		Employee e2 = new Employee(111,"BBB",290993.3f);
		Employee e3 = new Employee(444,"AAA",290993.3f);
		Employee e4 = new Employee(555,"CCC",290993.3f);
		
//		TreeSet<Employee> t = new TreeSet<Employee>();
		TreeSet<Employee> t = new TreeSet<Employee>(new MyComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		
		t.stream().sorted().forEach(System.out::println);
		
	}

}
