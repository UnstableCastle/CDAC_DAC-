package session_04;
import java.util.Scanner;
public class Person extends Object{
	private String firstName;
	private String lastName;
	private int age;
	protected Scanner s = new Scanner(System.in);
	
	public Person() {}

	public Person(String firstName, String lastName,
			int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void getData()
	{
	System.out.println("Enter your first n last name: ");
		firstName = s.next();
		lastName = s.next();
		System.out.println("Enter Age: ");
		age = s.nextInt();
	}
	
	public void display()
	{
		System.out.println(firstName+" "+lastName+" "+age);
	}
}
/*
Object

Person

Teacher

HOD
*/