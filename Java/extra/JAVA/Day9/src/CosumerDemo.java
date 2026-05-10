import java.util.*;
import java.util.function.Consumer;
public class CosumerDemo {
public static void main(String[] args) {
	
	
	List<Instructor> l = InstructorDetails.getAll(); 
			
	 Consumer <Instructor> c = x->{System.out.println(x);} ;
	 l.forEach(c);
			 
	 Consumer <Instructor> c1 = x->{System.out.print(x.getName()+" ");} ;
	 l.forEach(c1);
	 
	 Consumer <Instructor> c2 = x->{System.out.println(x.getGender());} ;
	 l.forEach(c1.andThen(c2));
			 
	 l.forEach(x->{if((x.isOnlineCourse())&&(x.getYearOfExp()>15)) 
		 c.accept(x);});
	
	 
}
}