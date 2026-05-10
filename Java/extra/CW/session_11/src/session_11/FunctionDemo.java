package session_11;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<Integer, Double> f = (a) -> Math.sqrt(a);
		System.out.println(f.apply(64));
		
		Function<String, String> f1 = 
				(s) ->s.toLowerCase()+" "+s.toUpperCase();
		System.out.println(f1.apply("Rahul"));
	}
}
