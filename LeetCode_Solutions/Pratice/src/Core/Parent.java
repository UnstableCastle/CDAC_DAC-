package Core;

public class Parent {

	public void printName() {
		System.out.println("Im a Parent");
	}
	
	public static void printStatic() {
		System.out.println("Static parent ");
	}

	class Child extends Parent{
		@Override
		public void printName() {
			System.out.println("im the child");
		}
		
		public static void printstatic(){
			System.out.println("Static child");
		}
	}
	
	public static void main(String[] args) {
//		Parent obj = new Child();
//		obj.printName();   // Line 1
//        obj.printStatic(); // Line 2
        
	}
}
//"Static things belong to the class" 
//This is the golden rule. 
//Static methods belong to the blueprint (Parent or Child), 
//not the actual objects sitting in the Heap.
//"And run before main method?" Static blocks (e.g., static { ... }) run when the class is loaded into memory (which happens before main).
//But static methods only run when you actually call them!