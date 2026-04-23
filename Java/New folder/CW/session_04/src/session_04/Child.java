package session_04;
public class Child extends Parent{
	@Override
	public Child m1()
	{
		return this;
	}
	
	public void msg()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		new Child().m1().msg();
	}
}
