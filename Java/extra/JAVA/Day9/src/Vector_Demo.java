import java.util.Enumeration;
import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>(10,5);//increase capacity
		System.out.println(v.capacity());
		
		for(int i =0;i<10;i++) {
			v.addElement(i);			
		}
		v.add(10);
		System.out.println(v.capacity());
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
			
		}
		System.out.println("\nSize of vector :"+v.size());
		System.out.println("\nCapacity of vector :"+v.capacity());
		
		
	}
}
