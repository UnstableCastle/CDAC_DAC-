package PREP;
import java.util.*;
public class PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) 
		{
			if(str.charAt(left)!=str.charAt(right)) {
				System.out.println("No");
				sc.close();
				return;
			}
			
			
			left++;
			right--;
			
		}
		System.out.println("Yes");
		sc.close();
		
		
	}
	
}
