
public class B extends A {
//@Override
	public void m1() {
		
		System.out.println("m1 of B");

	}

	
	public void m2() {
		System.out.println("m2() of B");
	}

	public static void main(String[] args) {
		//B b = new B();
//		System.out.println(b.no);
//		System.out.println("no = "+b.getNo());
//		b.m1();
		
		//POLYMORPHIC REFERENCE 
		
		A a = new B();
		A b = new A();
		a.m1();
		
		if(a instanceof B) {
			((B)a).m2();
		}
	
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(b instanceof B);
		
	}
	
}
