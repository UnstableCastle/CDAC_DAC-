package session_10;
import java.util.List;
import java.util.function.Predicate;
public class PredicateDemo1 {
	public static void main(String[] args) {
		
		List<Instructor> list = InstructorDetails.getAll();
		Predicate<Instructor> p1 = 
	(i) -> i.isOnlineCourse() && i.getYears_of_exp()>10;
		
		list.forEach((x) -> {
			if(p1.test(x))
			{
				System.out.println(x.getName());
			}
		});	
	}
}
