import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

		li.stream().forEach(System.out::println);

		int sum = IntStream.of(10, 203, 43, 5, 32, 11, 2).sum();

		System.out.println("Sum = " + sum);

		int t = IntStream.rangeClosed(1, 10).sum();

		System.out.println("Sum of 1 - 10 = " + t);

		int total = li.stream().filter((x) -> (x%2)==0).map(x->x*2).reduce(0, Integer::sum);
		System.out.println("Total  = "+total);
		
		long c = li.stream().count();
		
		System.out.println("count = "+c);
		
	}
}
