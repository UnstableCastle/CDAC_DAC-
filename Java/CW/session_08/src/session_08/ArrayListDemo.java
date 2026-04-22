package session_08;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.RandomAccess;
public class ArrayListDemo 
{
	public static void main(String[] args) {
		//Non-generic version of ArrayList
		//ArrayList a = new ArrayList();
		List a = new ArrayList();
		a.add(10);
		a.add('A');
		a.add("ABC");
		a.add(10.2f);
		a.add(10);
		a.add(null);
		System.out.println(a);
		
		a.add(1,'B');
		System.out.println(a);
		
		System.out.println(a.get(5));
		
		//a.isEmpty();
		
		ArrayList a1 = new ArrayList();
		a1.addAll(a);
		
		System.out.println(a1);
		
		//int i =(Integer) a.get(4);
		/*
		for(Object o:a)
		{
			Integer obj =(Integer) o;//ClassCastException
			System.out.println(o);
		}	*/
		
		System.out.println(a1 instanceof Serializable);
		System.out.println(a1 instanceof Cloneable);
		System.out.println(a1 instanceof RandomAccess);
		
		a.set(5,20);
		System.out.println(a);
		
		
	
		
	}
}
