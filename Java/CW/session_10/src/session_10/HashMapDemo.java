package session_10;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> h =
				new HashMap<Integer,String>();//16
		h.put(100, "Rahul");
		h.put(200, "Nikita");
		System.out.println(h.put(100, "Aryan"));
		h.put(null, null);
		System.out.println(h);
		
		
	}

}
