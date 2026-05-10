
public class D extends C{
	
	public D(){
		System.out.println("Default of C");
	}

	public D(int a) {
		super(10.3f);
		System.out.println("Para of C");
	}
	
	public static void main(String[] args) {
		D d = new D(10);
		
	}
}
