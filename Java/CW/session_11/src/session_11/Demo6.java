package session_11;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Demo6 {
	public static void main(String[] args) {
		List<Integer> list = 
				Arrays.asList(10,56,78,11,13,7,4);
		//iterate
		//all even nos
		//double
		//sum
	
		list.stream().forEach(System.out::println);
		
		int sum = IntStream.of(1,2,3,4,5).sum();
		System.out.println("sum = "+sum);
	 
		int t = IntStream.rangeClosed(1, 10).sum();
		System.out.println("Total = "+t);
			
	int total =	list.stream().
			filter(i -> i%2==0).
			map(a -> a*2).
			reduce(0, Integer::sum);
		System.out.println("Total = "+total);
		
		System.out.println("----------");
		list.stream().forEach(System.out::println);	
		
		System.out.println("-----------------");
		list.stream().sorted((a,b)->b.compareTo(a)).
		forEach(System.out::println);
		
	}
}
