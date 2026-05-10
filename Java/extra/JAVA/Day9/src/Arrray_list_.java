import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Arrray_list_ {
public static void main(String[] args) {
		
	ArrayList<String> a = new ArrayList<String>();
	
	a.add("CASTLE");
	a.add("Strelzia");
	a.add("Rio");
	a.add("Light");
	a.add("Winchester");
	System.out.println(a);
	
//	for(String s:a) {
//		System.out.println(s);	
//	}
//	Collections.sort(a);
//	System.out.println(a);
//	Object s =  a.get(3);
//	System.out.println(s);
//	a.forEach((x)->{System.out.println("  "+x+"  ");});
//	
//	
//	
//	List<String> list = Collections.synchronizedList(a);
//	System.out.println(list);
//			
//			System.out.println(a instanceof Serializable);
//			System.out.println(a instanceof Cloneable);
//			System.out.println(a instanceof RandomAccess);
//			
			
			System.out.println("------------");
			ListIterator<String> itr = a.listIterator();
			while(itr.hasNext()) {
				String str = itr.next();
				System.out.println(str);
			}
			System.out.println("------------");
			while(itr.hasPrevious()) {
				String str = itr.previous();	
				System.out.println(str);
				}
			
				
		}

		
	}

