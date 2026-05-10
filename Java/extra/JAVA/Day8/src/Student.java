import java.io.Serializable;

public class Student implements Serializable {
private int rollNo;
private String name;

public Student () {}

public Student(int rollNo,String name) {
this.name = name;
this.rollNo = rollNo;
}

@Override
public String toString() {
	return "Student = [ Name : "+name+" RollNo : "+rollNo+" ]";
}
}
