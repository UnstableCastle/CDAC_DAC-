package A1;

public class Person {
private String name;
private int age;

public Person() {
	
	age=18;
}

public Person(String name) {
	this();
	this.name=name;

}


public String toString() {
	return "Person = [name = "+name+" , age = "+age+" ]";
}

public static void main(String args[]) {
	Person p = new Person("Castle");
	System.out.println(p);
	
}
}
