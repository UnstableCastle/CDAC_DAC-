import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Enter Number : ");
		n = s.nextInt();
		int o = n;

		int R = 0;
		while(n != 0) {
			int digit = n%10;
			R = R*10+digit;
			n = n/10;
			
		}
		
		if(o == n)			
		System.out.println("Palindrome number : ");
		
		s.close();
	}
}
