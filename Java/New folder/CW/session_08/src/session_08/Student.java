package session_08;
import java.io.Serializable;
public class Student implements Serializable{
	
	private transient int rollNo;
	private String name;
	
	public Student() {}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ""
				+ ", name=" + name + "]";
	}

}
