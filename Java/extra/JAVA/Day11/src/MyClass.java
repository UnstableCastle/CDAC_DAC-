import java.util.function.Supplier;
import java.util.function.Function;
public class MyClass {
	
	private String message;
	
	public MyClass() {}
	
	public MyClass(String message) {
		super();
		this.message = message;
	}

	public String getMsg() {
		return message;
	}	
	

	public static void main(String[] args) {
		
		Supplier<MyClass> s = MyClass::new;
		MyClass m = s.get();
		
		System.out.println(m.message);
		
		Function<String, MyClass> f = MyClass::new;
		MyClass cls = f.apply("Infoway");
		System.out.println(cls.getMsg());
		
	}
	
	
}
