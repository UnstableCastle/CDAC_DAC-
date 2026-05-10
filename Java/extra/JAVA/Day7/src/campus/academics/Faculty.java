package campus.academics;
import campus.data.Person;

public class Faculty extends Person {
    public int facultyId;
    public double salary;
    public String branch;

    public Faculty(String n, int a, String ad, int id, double sal, String br) {
        super(n, a, ad);
        facultyId = id;
        salary = sal;
        branch = br;
    }

	@Override
	public String toString() {
		return super.toString()+" facultyId=" + facultyId + ", salary=" + salary + ", branch=" + branch + "]";
	}
    
}
