package session_10;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
public class BiConsumerDemo1 {
	public static void main(String[] args) {
		List<Instructor> list = InstructorDetails.getAll();
		Predicate<Instructor> p1 = 
	(i) -> i.isOnlineCourse() && i.getYears_of_exp()>10;
	
	
	BiConsumer<String, String> b1 =
			(x,y) -> System.out.println(x+" "+y);
	
		list.forEach((x) -> {
			if(p1.test(x))
			{
				b1.accept(x.getName(), x.getGender());
			}
		});	
		
		
		System.out.println("---------");
		Predicate<Instructor> p2 = 
				(i) -> i.isOnlineCourse();
		
		BiConsumer<String, List<String>> b2 = 
				(a,b) -> {System.out.println(a+" "+b);};
		list.forEach((x) -> {
			if(p2.test(x))
			{
				b2.accept(x.getName(), x.getCourses());
			}	
		});	
	}
}
