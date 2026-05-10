package session_09;
import java.util.Arrays;
import java.util.List;
public class ArrayAsListDemo {
	public static void main(String[] args) {
		Character ch[] = {'A','a','Z','H','T'};
		//List<Character> list = Arrays.asList(ch);
		List list = Arrays.asList(ch);
	
		  list.set(1, 'M');
		  list.forEach(x -> {System.out.println(x);});
		 
		//list.add('N');//UnsupportedOperationException
		//System.out.println(list);
		
		list.set(0, "MNO");//ArrayStoreException
		System.out.println(list);	
	}
}
