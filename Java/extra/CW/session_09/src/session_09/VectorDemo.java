package session_09;
import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
	public static void main(String args[])
	{
		Vector<Integer> v = new Vector<>();
		System.out.println(v.capacity());
		
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		v.add(11);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
