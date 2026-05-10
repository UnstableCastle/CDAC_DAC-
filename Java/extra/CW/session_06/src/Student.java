
public class Student implements Cloneable{
	private int rollNo;
	private String name;
	private Subject subject;
	
	//generate default, param const, toString 
	//getters and setters
	public Student() {}
	
	public Student(int rollNo, String name, Subject subject) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
	}

	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + "]";
	}

	@Override
	protected Object clone() 
			throws CloneNotSupportedException {
		Student s =(Student) super.clone();
		s.subject = (Subject) subject.clone();
		return s;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	
}
