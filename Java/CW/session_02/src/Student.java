public class Student {	
	private int rn;//instance variable
	private String name;
	private static int count;//static variable

	public Student() {}

	public Student(int rn, String name) {
		this.rn = rn;
		this.name = name;
		count++;
	}

	public String toString() {
	return "Student [rn=" + rn + ", name=" + name + "]";
	}
	
	public static void getCount()
	{
		System.out.println("Count = "+count);
	}
	
	static
	{
		System.out.println("Static Block Called");
		count = 60;
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		Student s1 = new Student(1,"Rahul");
		Student s2 = new Student(2,"Priyanka");
		Student s3 = new Student(3,"Sayalee");
		//ClassName.staticMethodName();
		Student.getCount();	
	}
}
