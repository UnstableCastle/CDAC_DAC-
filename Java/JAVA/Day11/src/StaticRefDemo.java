import java.util.List;
import java.util.function.Predicate;

public class StaticRefDemo {

	public static boolean yrOfExpGtTen(Instructor instructor) {
		if(instructor.getYearOfExp()>=10)return true;
		else
		return false;
		
		
	}
	
	public static void main(String[] args) {
		List<Instructor> list = InstructorDetails.getAll();
		Predicate<Instructor> p = StaticRefDemo::yrOfExpGtTen;
		list.forEach(x->{
			
		if(p.test(x))
			System.out.println(x.getName()+" "+x.getYearOfExp());
			
		});
		
	}
	
}
