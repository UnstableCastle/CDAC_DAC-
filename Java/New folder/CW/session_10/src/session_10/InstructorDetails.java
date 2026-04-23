package session_10;
import java.util.Arrays;
import java.util.List;
public class InstructorDetails {
	public static List<Instructor> getAll()
	{
		Instructor i1 =
	new Instructor("Rahul", 23, "Male",1,
			false, Arrays.asList("C","C++",".net"));
		
		Instructor i2 = new Instructor("Sayalee", 27, "Female", 3,false, Arrays.asList("SQL","Oracle","MongoDB"));
		Instructor i3 = new Instructor("Nikita", 40, "Female", 10, true, Arrays.asList("Docker","Kubernates","Kafka"));
		Instructor i4 = new Instructor("Aditya", 47, "Male", 16, true, Arrays.asList("AWS","CloudComputing","Azure"));
		Instructor i5 = new Instructor("Aryan", 25, "Male",2, false, Arrays.asList("Java","Servlet","JSP"));
		
		List<Instructor> list =
				Arrays.asList(i1,i2,i3,i4,i5);
		return list;
	}
}
