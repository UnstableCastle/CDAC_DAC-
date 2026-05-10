@MyAnnotation(info="Student is the user defined Class")
public class Student {
	@MyAnnotation(info="Data member of Student")
	int rollno;

    @MyAnnotation(info="constructor of Student")
    public Student() {}

    @MyAnnotation(info="Method for Student")
    public void get() {} 
}