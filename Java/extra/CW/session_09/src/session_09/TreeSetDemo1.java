package session_09;
import java.util.TreeSet;
public class TreeSetDemo1 {
	public static void main(String[] args) {
		//TreeSet<Integer> t = new TreeSet<Integer>();
		TreeSet<Integer> t = 
				new TreeSet<Integer>(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);
	}
}
/*
10 [10]
0 [0 10]
15 [0 15 10]
	[0 10 15]
10 [0 10 15]
*/