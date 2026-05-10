package session_07;

public class HelloWorldTraditional implements HelloWorldInterface{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello";
	}
	
	public static void main(String[] args) {
		
		HelloWorldInterface h = new HelloWorldTraditional();
		System.out.println(h.sayHello());
		
	}

}
