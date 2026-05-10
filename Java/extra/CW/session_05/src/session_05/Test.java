package session_05;

public class Test {
	public static void main(String[] args) {
		Student s = new Student(1, "Rahul");
		s = new Student(2,"priyanka");
		//s.rollNo = 3;//CTE - content cant be changed
		System.out.println(s.getRollNo()+" "+s.getName());
		
		//Making reference final
		//final Student s = new Student(1, "Rahul");
	}
}
