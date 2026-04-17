import java.util.TreeSet;;
public class TreeSetDemo {
public static void main(String[] args) {
	

	TreeSet<Integer> t = new TreeSet<Integer>();
t.add(10);	
//t.add(null); //nullpointer
//t.add(10.2f);//classcast
t.add(89);
t.add(78);

System.out.println(t);
	
	
}
}