import java.util.Arrays;
import java.util.List;

public class ArrayasList {

	public static void main(String[] args) {
		
		Character ch[]= {'A','B','C','D','E','F'};
		
		List list = Arrays.asList(ch);
		
		list.set(1, 'M');
		list.forEach(x ->{System.out.println(x);});
	

//		list.set(2, "abc");//java.lang.ArrayStoreException
//		list.forEach(x ->{System.out.println(x);});
//	
//		list.add(10);//java.lang.UnsupportedOperationException
//		list.forEach(x ->{System.out.println(x);});
//	
	
	
	
	}
}

