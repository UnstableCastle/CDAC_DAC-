
public class Student_1 {
private int rn;
private String name;
private static int count;

public Student_1() {}

public Student_1(int rn , String nm ) {
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
	Student_1 s1 = new Student_1(1,"Castle");
	Student_1 s2 = new Student_1(2,"Strelzia");
	Student_1.getCount();
	System.out.println(s1);
	System.out.println(s2);
	
	
	
}
	
}
