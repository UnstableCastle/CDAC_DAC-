
public class Student {
private int rn;
private String name;
private static int count;

public Student() {}

public Student(int rn , String nm ) {
	this.rn = rn;
	this.name=nm;
	count++;
}

public String toString() {
	return "Student = [ Name : "+name+" Rollno : "+rn+" ]";
} 	


public static void getCount() {
	
	System.out.println("Count = ["+count+"]");
}

public static void main(String[] args) {
	Student s1 = new Student(1,"Castle");
	Student s2 = new Student(2,"Strelzia");
	Student.getCount();
	System.out.println(s1);
	System.out.println(s2);
	
	
	
}
	
}
