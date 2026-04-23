package session_10;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap<String, Integer> h = 
				new HashMap<String,Integer>();
		h.put("Rahul", 600);
		h.put("Nikita", 500);
		h.put("Arjun", 700);
		h.put("Aditya", 800);
		h.put("Tushar", 1000);
		System.out.println(h);
	 
		Set<String> s = h.keySet();
		System.out.println(s);
		
		Collection<Integer> c = h.values();
		System.out.println(c);
		
	Set<Entry<String,Integer>> s1 = h.entrySet();
		System.out.println(s1);
		
		System.out.println("----------");
		Iterator<Map.Entry<String, Integer>> itr =
				s1.iterator();
		while(itr.hasNext())
		{
		  Map.Entry<String, Integer> i =  itr.next();
		  System.out.println(i.getKey()+" "+i.getValue());
		  if(i.getKey().equals("Aditya"))
		  {
			  i.setValue(2000);
		  }
		}
		System.out.println(h);
	}

}

/*
interface Map
{
	interface Entry
	{
		getKey()
		getValue()
		setValue()
	}
}*/


