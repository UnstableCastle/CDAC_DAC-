package campus.academics;
import campus.data.Person;

public class Student extends Person {
    public int rollno, semester;
    public String branch;
    
    

    public Student(String n, int a, String ad, String b, int r, int s) {
        super(n, a, ad);
        rollno = r;
        semester = s;
        branch = b;
        
    }

	
    
}
