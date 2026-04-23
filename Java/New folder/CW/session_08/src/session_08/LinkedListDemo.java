package session_08;
import java.io.*;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {	
		LinkedList<Integer> l = new LinkedList<Integer>();
		//List<Integer> l = new LinkedList<Integer>();
		l.add(10);
		//l.add('A');//CTE
		l.add(23);
		l.add(78);
		l.add(98);
		l.add(10);
		System.out.println(l);
		
		((LinkedList<Integer>) l).addFirst(56);
		//l.addLast(null);
		System.out.println(l);
		/*
		l.removeLast();
		System.out.println(l);
		
		l.remove();
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		*/
		
		Iterator itr = l.iterator();
		//Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			int n = (Integer)itr.next();
			if((n%2) == 0)
				itr.remove();	
		}
		
		System.out.println(l);
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		
	}
}
