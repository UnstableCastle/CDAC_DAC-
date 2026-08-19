package Collections;

import java.util.HashSet;
import java.util.Set;

public class UniqueCustomers {
public static void main(String[] args) {
	
	int[] clickedIDs = {101,105,102,101,103,105,109,102};
	
	Set<Integer> id = new HashSet<Integer>();
	
	for (Integer i : clickedIDs) {
		id.add(i);
	}
	
	System.out.println(id.size());
	
	System.out.println("Unique ids :" + id);
	
}
}
