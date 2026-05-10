import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemo1 {
public static void main(String[] args) {
	

	TreeSet<Integer> t = new TreeSet<Integer> ();
t.add(10);	
//t.add(null); //nullpointer
//t.add(10.2f);//classcast
t.add(89);
t.add(78);
t.add(12);
t.add(34);

System.out.println(t);
	
	
}
}