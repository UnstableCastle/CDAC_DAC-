//
//1.	Find Even Number using Stream
//2.	Covert list of String to uppercase
//3.	Find maximum number 
//4.	Count strings with length greater than 3
//5.	Sort employees by name using comparator
//6.	Remove duplicate elements from the list of integer/String
//7.	Find sum of all elements
//8.	Find first element from the list of Integer/String

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		System.out.println("============================ ONE ====================================================");
		List<Integer> l = IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
		System.out.println(l);

		IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 0).forEach(System.out::println);

		
		
		List<String> list = new ArrayList<String>();
		list.add("ABC");list.add("DEf");list.add("GHIJ");list.add("KLMN");
		System.out.println();
		System.out.println(list);
		
		

		List<String> l1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(l1);

		int max = IntStream.rangeClosed(1, 100).boxed().max(Integer::compare).get();
		System.out.println(max);
	}

}
