package PREP;
import java.util.*;
public class Vowels_Consonants {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		int vovel=0;
		int consonent = 0;
		
		for(char c: str.toCharArray()) {
			
			if(Character.isLetter(c)) {
			if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vovel ++;
			}
			else {
				consonent++;
			}
		}
		}
		
		System.out.println(vovel+" "+consonent);
		
	}
	
}
