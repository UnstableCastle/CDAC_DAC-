package session_07;
@FunctionalInterface
public interface HelloWorldInterface {
	int no = 100;
	
	public String sayHello();
	
	public static void getNo()
	{
		System.out.println("no = "+no);
	}
	
	public default void get()
	{
		System.out.println("Java 8 Default method");
	}
	
}
