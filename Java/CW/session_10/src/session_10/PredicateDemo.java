package session_10;
import java.util.function.Predicate;
public class PredicateDemo {
	public static void main(String[] args) {
		//greater than 10
		Predicate<Integer> p = (x) -> x>10;
		System.out.println(p.test(1));
		
		//should be an even no
		Predicate<Integer> p1 = (x) -> (x%2) == 0;
		//greater than 10 and even no
		System.out.println(p.and(p1).test(35));
		
		//greater than 10 or even no
		System.out.println(p.or(p1).test(8));
		
		//greater than 10 and odd no
		System.out.println(p.and(p1.negate()).test(37));
	}
}
