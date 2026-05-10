package session_10;
import java.util.Hashtable;
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Temp, String> h = 
			new Hashtable<Temp,String>();//11
		h.put(new Temp(1), "C");
		h.put(new Temp(5), "D");
		h.put(new Temp(4), "E");
		h.put(new Temp(23), "A");
		h.put(new Temp(15), "B");
		//h.put(null, null);//java.lang.NullPointerException
		h.put(new Temp(1), "C");
		System.out.println(h);
	}
}
