package cloning;
public class Test {
	public static void main(String[] args) 
			throws CloneNotSupportedException {
		
		Subject subject = new Subject("Math", "Chemistry", 
				"Physics");
		Student student = new Student(1,"Rahul",subject);
		System.out.println(student);
		
		Student studentCopy =(Student) student.clone();
		System.out.println(studentCopy);
		
		studentCopy.getSubject().setSub1("Java");
		
		System.out.println(student.getSubject().getSub1());	
	}
}
