
public class HelloWorldLambda {

	public static void main(String[] args) {
		
//		HelloWorldInterface h = ()->{return"hello world";}; 
		HelloWorldInterface h = ()->"Hello world";
		System.out.println(h.sayHello());
		
		h.get();
		
		HelloWorldInterface.getNo();
		
		
	}
}
