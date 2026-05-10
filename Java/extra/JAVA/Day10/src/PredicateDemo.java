import java.util.function.Predicate;
public class PredicateDemo {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = x -> x>10;
		System.out.println(p.test(10));
		
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		
		Predicate<Integer> p1 = x -> (x%2)==0;
		System.out.println(p1.test(2));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println(p.and(p1).test(12));
		
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		
		System.out.println(p.and(p1.negate()).test(12));
		
	}

}
