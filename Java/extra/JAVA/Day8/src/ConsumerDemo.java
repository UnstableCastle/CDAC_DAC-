import java.util.function.Consumer;
public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c =(x)-> System.out.println("Length = "+x.length()+" Value of x : "+x);
		
		c.accept("UNSTABLECASTLE");
		
			Consumer<Integer> c1 = (a) -> {System.out.println(a+a);System.out.println(a/a);};
				
		c1.accept(10);	
		
		
		
		
		
	}
	
}
