import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>() ;
		h.put("CASTLE", 100);
		h.put("STRLIZIA", 200);
		h.put("WINCHESTER", 300);
		h.put("LOVEGOOD", 400);
		h.put("GRANGER", 500);
		System.out.println(h);
		Set<String> s = h.keySet();
		System.out.println(s);
		Collection<Integer> c = h.values();
		System.out.println(c);
		
		Set<Entry<String, Integer>> s1 = h.entrySet();
		System.out.println(h);
		
//		h.put(null, null);System.out.println(h); //java.lang.NullPointerException
		
		
		System.out.println("------------------------");
		Iterator<Entry<String, Integer>> itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> i  = itr.next();
			System.out.println(i.getKey()+" "+i.getValue());
			if(i.getKey().equals("CASTLE")) {
				i.setValue(10000);
		
			}
			System.out.println(h);
		}
		
	}
	
}
