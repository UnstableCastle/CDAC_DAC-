package session_09;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetDemo {
	public static void main(String[] args) {	
		//HashSet h = new HashSet();//16
		LinkedHashSet h = new LinkedHashSet();
		h.add(null);
		h.add('A');
		h.add(10);
		h.add(16.8f);
		System.out.println(h.add(10));//false
		h.add(null);
		
		System.out.println(h);
	}
}
