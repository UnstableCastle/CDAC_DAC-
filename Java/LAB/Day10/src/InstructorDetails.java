import java.util.Arrays;
import java.util.List;


public class InstructorDetails {

	public static List<Instructor> getAll(){
		
		
		Instructor i1 = new Instructor("Amaan", 23, "Male", true, 3, Arrays.asList("Java", "Spring"));
		Instructor i2 = new Instructor("Priya", 27, "Female", false, 5, Arrays.asList("Data Science", "Python"));
		Instructor i3 = new Instructor("Kunal", 30, "Male", true, 18, Arrays.asList("Microservices", "Docker"));
		Instructor i4 = new Instructor("Sneha", 22, "Female", true, 11, Arrays.asList("HTML", "CSS", "JavaScript"));
		Instructor i5 = new Instructor("Aditya", 28, "Male", false, 16, Arrays.asList("AWS", "DevOps"));
		
		List<Instructor> list = Arrays.asList(i1,i2,i3,i4,i5);
		
		return list;
		
		
	};
	
}
