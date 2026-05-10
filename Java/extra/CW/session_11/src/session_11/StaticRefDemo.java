package session_11;
import java.util.List;
import java.util.function.Predicate;
public class StaticRefDemo {
	
	public static boolean
	yrsOfExpGtTen(Instructor instructor)
	{
		if(instructor.getYears_of_exp()>=10)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		List<Instructor> list = InstructorDetails.getAll();
		Predicate<Instructor> p =
				StaticRefDemo::yrsOfExpGtTen;
		list.forEach(x -> {
			if(p.test(x))
				System.out.println(x.getName()+""
						+ " "+x.getYears_of_exp());
		});
	}
}


