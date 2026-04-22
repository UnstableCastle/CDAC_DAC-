package session_09;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class ConsumerDemo {
	public static void main(String[] args) {
		List<Instructor> l = InstructorDetails.getAll();
		//Get list of all Instructors
		Consumer<Instructor> c =
				a -> {System.out.println(a);};
		l.forEach(c);
		
		//Get names of all Instructors
		System.out.println("--------");
		Consumer<Instructor> c1 = 
				a -> {System.out.println(a.getName());};
		l.forEach(c1);
		
		//Get name and gender of all Instructors
		System.out.println("-------");
		Consumer<Instructor> c2 =
				a -> {System.out.println(a.getGender());};
		l.forEach(c1.andThen(c2));
		
		//Get list of all instructors who teaches online
		System.out.println("---------");
		l.forEach(x -> {
			if(x.isOnlineCourse())
				c1.accept(x);
		});
		
		
		//Get list of all instructors who teaches online
		//and yearsOfExperience > 15
		Predicate<Instructor> p = i -> i.isOnlineCourse();
	}
}
