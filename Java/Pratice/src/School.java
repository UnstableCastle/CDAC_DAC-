import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class School {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Array list to store Students
		ArrayList<Student_Result> s = new ArrayList<Student_Result>();
		for(int i =0; i<5;i++) {
			
			System.out.println("Enter id");
			int id = scanner.nextInt();
			System.out.println("Enter NAme ");
			String name = scanner.nextLine();
			scanner.nextLine();
			System.out.println("enter Dep");
			String dept = scanner.nextLine();
			System.out.println("enter Marks");
			double marks = scanner.nextDouble();
			
			s.add(new Student_Result(id,name,dept,marks));
							
			
		}
		
		System.out.println("-------------------To display Students---------------");
		// To display Students
		for(Student_Result a: s) {
			System.out.println(a);
		}
		
		System.out.println("-----------------marks greater than 60-----------------");
		//marks greater than 60
	s.stream().filter(x->(x.getMarks()>60)).forEach(System.out::println);
	System.out.println("-----------------marks in rev order-----------------");
	//marks in rev order
	s.stream().sorted(Comparator.comparing(Student_Result::getMarks).reversed()).forEach(System.out::println);
	
	
	System.out.println("----------------students belonging to that department,------------------");
	Map<String, List<Student_Result>> m = s.stream().collect(Collectors.groupingBy(Student_Result::getDept));
	System.out.println(m);
	
	
	}
		
		
	
	
}