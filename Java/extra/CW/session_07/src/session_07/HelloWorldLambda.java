package session_07;

public class HelloWorldLambda {
	
	public static void main(String[] args) {
		
//HelloWorldInterface h = () -> {return "Hello World";};
		HelloWorldInterface h = () ->  "Hello World";
		System.out.println(	h.sayHello());
		h.get();
		HelloWorldInterface.getNo();
	}

}
