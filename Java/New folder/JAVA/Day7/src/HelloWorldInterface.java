@FunctionalInterface
public interface HelloWorldInterface {
	int no =100;
	public String sayHello();
	
	public static void getNo() {
		System.out.println("no = "+no);
	}

	public default void get() {
		System.out.println("in java 8 incdefault method");
	}
	
}
