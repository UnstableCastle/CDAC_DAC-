import java.util.List;
import java.util.function.Predicate;
public class PredicateDemo2 {
public static void main(String[] args) {
	
	
	List<Instructor> list = InstructorDetails.getAll();
	
	Predicate<Instructor> p1 = i -> i.isOnlineCourse() && i.getYearOfExp()>10;
	list.forEach((x)->{if(p1.test(x)) {
		System.out.println(x.getName());
	}});
	
}
	
}
