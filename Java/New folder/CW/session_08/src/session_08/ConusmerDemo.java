package session_08;

import java.util.function.Consumer;
public class ConusmerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c = 
(x) -> System.out.println(x.length()+" Value of x: "+x);
		c.accept("Infoway");
		
		//Consumer with block statements
		Consumer<Integer> c1 = (a) -> {
			System.out.println(a+a);
			System.out.println(a/a);
		};
		c1.accept(10);
	}
	
}
