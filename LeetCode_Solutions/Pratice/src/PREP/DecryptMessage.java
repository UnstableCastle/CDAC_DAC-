package PREP;
import java.util.*;
public class DecryptMessage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String interceptedMessage = sc.nextLine();
		
		String[] words = interceptedMessage.split(" ");
		
		for(int i = words.length - 1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
		sc.close();
	}

}


