package session_08;
import java.util.*;
public class ArrListDemo {
	public static void main(String[] args) {
		//Generic version of ArrayList
		ArrayList<String> a = new ArrayList<String>();
		//a.add(null);NullPointerException
		//a.add(17);//CTE
		a.add("Rahul");
		a.add("Priyanka");
		a.add("sayalee");
		a.add("Rohit");
		a.add("Yash");
		System.out.println(a);
		
		for(String s:a)
		{
			System.out.println(s);
		}
		
		Collections.sort(a);
		System.out.println(a);
		
		Object s = a.get(3);
		//String s = a.get(3);
	
		
		a.forEach((x) -> { System.out.println(x);});
		
		List l = a.stream().sorted(String::compareTo).toList();
		System.out.println(l);
		
		List<String> list = Collections.synchronizedList(a);
		//list - synchronized
		//a - non-synchronized
		System.out.println("-----------");
		ListIterator<String> itr = a.listIterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			if(str.equals("sayalee"))
				//itr.set("Sahil");
				//itr.remove();
				itr.add("Aryan");
		}
		System.out.println(a);
		
		while(itr.hasPrevious())
		{
			String str = itr.previous();
		
		}
		System.out.println(a);
	}

}
