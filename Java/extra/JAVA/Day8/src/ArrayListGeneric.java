import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ArrayListGeneric {
public static void main(String[] args) {
	
	ArrayList<String> a = new ArrayList<String>();
	
	
	a.add("CASTLE");
	a.add("Strelzia");
	a.add("Rio");
	a.add("Light");
	a.add("Winchester");
	System.out.println(a);
	
	for(String s:a) {
		System.out.println(s);	
	}
	Collections.sort(a);
	System.out.println(a);
	Object s =  a.get(3);
	System.out.println(s);
	a.forEach((x)->{System.out.println("  "+x+"  ");});
	
	
	
	List<String> list = Collections.synchronizedList(a);
	System.out.println(list);
	
}
}
