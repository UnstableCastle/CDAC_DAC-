package session_14;
import java.util.ArrayList;
import java.util.List;
public class Test1 {
public static void printNumbers(List<? extends Number> l1)
	{
		//UpperBound
		l1.get(0);
		l1.add(10);//CTE
		for(Number i:l1)
		{
			System.out.println(i);
		}
	}
	
	public static void addNumbers(List<? super Number> l2)
	{//LowerBound
		l2.add(10);
		l2.add(10.2);
		l2.add("abc");//CTE
		Object  o = l2.get(0);
		int i = l2.get(0);//CTE
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Number> l2 = new ArrayList<>();
		printNumbers(l1);
		addNumbers(l2);
		//extends - upperBound - read Only - producer
		//super - lowerBound - add - consumer	
	}
}
