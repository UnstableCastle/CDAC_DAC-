package session_04;
public class D extends C{	
	public D()
	{
		//super();
		super();
		System.out.println("In default of D");
	}
	
	public D(int a)
	{
		//super();
		super(10.2f);
		System.out.println("In Parameterized of D");
	}
	
	public static void main(String[] args) {
		//D d = new D();
		D d = new D(10);
		
	}
}
