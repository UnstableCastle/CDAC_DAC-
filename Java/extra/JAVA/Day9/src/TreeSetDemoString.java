import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetDemoString {
public static void main(String[] args) {
	
	TreeSet<String> t = new TreeSet<String> ();
//	TreeSet<String> t = new TreeSet<String> (new MyComparator2());
t.add("Amaan");	
//t.add(null); //nullpointer
//t.add(10.2f);//classcast
t.add("Sid");
t.add("Sagar");
t.add("dddd");
t.add("Shruti");

System.out.println(t);
	
	
}
}