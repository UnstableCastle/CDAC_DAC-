package session_04;
public class B extends A{
	//@Override
	public void m1()
	{
		System.out.println("In m1() of B");
	}
	
	public void m2()
	{
		System.out.println("In m2 of B");
	}
	
	public static void main(String[] args) {	
		//B b = new B();
		//System.out.println(b.no);//CTE
		//System.out.println("no = "+b.getNo());
		//b.m1();
		
		//PolyMorphic Reference
		//SuperCls ref = childClsObject;
		A a = new B();
		//B b = new A();//not allowed
		//A a = new A();
		//B b = new B();
		a.m1();
		
		if(a instanceof B)
		{
		((B)a).m2();
		//in order to call SubClass specific method
		//Downcast the reference from super to sub
		}
		
		System.out.println(a instanceof A);//true
		System.out.println(a instanceof B);//true
	}
}
