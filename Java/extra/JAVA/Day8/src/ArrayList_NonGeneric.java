import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
public class ArrayList_NonGeneric {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		    
		a.add(10);
		a.add('A');
		a.add("ABC");
		a.add(10);
		a.add(10.2f);
		a.add(null);
		
		
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		for(Object o:a) {
			
//			Integer object  =  (Integer)o;
			System.out.println(" "+o);
			
		}
		
		System.out.println(a instanceof Serializable);
		System.out.println(a instanceof Cloneable);
		
		System.out.println(a instanceof RandomAccess);
		
		
		
		
	}
	
}
