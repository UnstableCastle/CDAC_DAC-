package session_14;
import java.util.concurrent.ConcurrentHashMap;
public class DEmo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> h = 
			new ConcurrentHashMap<Integer,String>();
		h.put(100, "Rahul");
		System.out.println(h.put(100, "Nikita"));
		System.out.println(h);
		h.putIfAbsent(101, "Neelam");
		System.out.println(h);
		h.putIfAbsent(100, "Rohan");
		System.out.println(h);
		System.out.println(h.replace(101,"Java","Aditya"));
		System.out.println(h);
		System.out.println(h.remove(100));
	}
}
