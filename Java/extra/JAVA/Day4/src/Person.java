import java.util.*;
public class Person extends Object {
private String firstName;
private String lastName;
private int age;
 Scanner s = new Scanner(System.in);

public Person() {
//	System.out.println("Constructor of Person Class");
}


public Person(String firstName,String lastName,int age) {
	super();
	this.firstName=firstName;
	this.lastName=lastName;
	this.age=age;
	
}
public void getData() {
	System.out.println("Enter First Name : ");
	firstName = s.next();
	System.out.println("Enter Last Name  : ");
	lastName = s.next();
	System.out.println("Enter Age        :");
	age = s.nextInt();
	
}

public void display() {
	
	System.out.println("FirstName :"+firstName+" LastName :"+lastName+" Age: "+age);
}


@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
}



}
