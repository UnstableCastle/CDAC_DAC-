import java.util.Scanner;
public class Reverse {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Enter Number : ");
		n = s.nextInt();
		
		int R = 0;
		while(n != 0) {
			int digit = n%10;
			R = R*10+digit;
			n = n/10;
			
		}
			
		System.out.println("Reverse number : "+R);
		
		s.close();
	}
}
