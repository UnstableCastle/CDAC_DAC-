
public class Student {
private int rollno;
private String name;
private int s1;
private int s2;
private int s3;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getS1() {
	return s1;
}
public void setS1(int s1) {
	this.s1 = s1;
}
public int getS2() {
	return s2;
}
public void setS2(int s2) {
	this.s2 = s2;
}
public int getS3() {
	return s3;
}
public void setS3(int s3) {
	this.s3 = s3;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
}
public Student(int rollno, String name, int s1, int s2, int s3) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.s1 = s1;
	this.s2 = s2;
	this.s3 = s3;
}



	
}
