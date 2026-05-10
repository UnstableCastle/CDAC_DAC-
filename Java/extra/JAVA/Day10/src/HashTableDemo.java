import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {
public static void main(String[] args) {
	
	
	Hashtable<Temp, String> h = new Hashtable<Temp, String>();
	
	h.put(new Temp(1), "A");
	h.put(new Temp(2), "B");
	h.put(new Temp(3), "C");
	h.put(new Temp(4), "D");
	h.put(new Temp(5), "E");
	h.put(new Temp(6), "F");
	
	System.out.print(h);
	
	
	
	
}
}
