package PREP;
import java.util.*;
public class NonrepeatingChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String packet = sc.next();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] s = packet.toLowerCase().toCharArray();
		
		for(Character c: s) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		
	for(char c: s) {
		int count = map.get(c);
		
		
		if(count ==1) {
			System.out.println(c);
		sc.close();
		return;
		}
		
	}
		
	System.out.println("#");
	sc.close();
	}
	
}
