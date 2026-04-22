package session_11;
import java.util.function.Function;
import java.util.function.Supplier;
public class MyClass {
	private String message;
	
	public MyClass(){}
	
	public MyClass(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}

	public static void main(String[] args) {
		Supplier<MyClass> s = MyClass::new;
		MyClass m = s.get();
		System.out.println(m.getMessage());
		
		Function<String, MyClass> f =  MyClass::new;
		 MyClass cls = f.apply("Infoway");
		System.out.println(cls.getMessage());
		
	
	}
}
