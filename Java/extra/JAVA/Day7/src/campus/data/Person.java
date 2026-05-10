package campus.data;

public class Person {
    public String name, address;
    public int age;

    public Person() {}
    public Person(String n, int a, String ad) {
        name = n;
        age = a;
        address = ad;
    }
	@Override
	public String toString() {
		return "Details name=" + name + ", address=" + address + ", age=" + age + "]";
	}
    
}
