package Core;


//inhertance
public class Manager extends Employee {
	public Manager() {
//		super();
		System.out.println("Manager Created");
	}

	public static void main(String[] args) {
		Manager m = new Manager();
	}
}

//class Vehicle {
//    String brand;
//    public Vehicle(String brand) {
//        this.brand = brand;
//    }
//}
// class Car extends Vehicle {
//    public Car() {
//    	super("Toyota");
//        // super(); is silently placed here, but Vehicle has no default constructor!
//        // COMPILE ERROR!
//        
//        // FIX: We must explicitly write: super("Toyota");
//    }
//}