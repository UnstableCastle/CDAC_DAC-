package session_10;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> b1 =
				(x,y) -> {System.out.println(x+" "+y);};
		b1.accept(10, 20);
		
		BiConsumer<String,String> b2 = 
			(a,b) -> {System.out.println(a.concat(b));};
		b2.accept("Infoway", " Tech..");
	}

}
