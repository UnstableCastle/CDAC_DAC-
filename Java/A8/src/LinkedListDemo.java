import java.util.*;
import java.io.*;
public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<Integer> l = new LinkedList<Integer>();	
	
	l.add(10);
	l.add(11);
	l.add(20);
	l.add(21);
	l.add(22);
	l.add(23);
	System.out.println(l);
	((LinkedList<Integer>)l).addFirst(56);
	l.add(null);
	System.out.println(l);
	l.remove();
	System.out.println(l);
	l.removeLast();
	System.out.println(l);
	
	Iterator itr = l.iterator();
	while(itr.hasNext()) {
		int n = (Integer)itr.next();
		if((n%2)==0) {
			itr.remove();
		}
	}
	
	System.out.println(l);
	
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof Cloneable);
	
	System.out.println(l instanceof RandomAccess);
	
}
	
	
}
