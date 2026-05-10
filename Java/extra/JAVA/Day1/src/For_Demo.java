import java.util.*;
public class For_Demo {

	public static void main(String []args) {
		int n, fact = 1 ;
		System.out.println("enter number to find factorial ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i = 1 ; i <= n;i++) {
			fact*=i; //fact = fact * i;
		}
	System.out.println("Factorial = "+fact);
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
