package session_04;
public class Teacher extends Person{
	private String subject;
	
	public Teacher() {}
	
	public Teacher(String fname,String lname,
			int age,String subject)
	{
		super(fname,lname,age);
		this.subject = subject;
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("Enter subject: ");
		subject = s.next();	
	}
	
	public void display()
	{
		super.display();
		System.out.println(subject);
	}
}
