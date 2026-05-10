import java.util.*;
public class Add_two_no {

	public static void main(String[]args) {
		
		int a , b ,sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value for A and B : ");
		a = s.nextInt();
		b = s.nextInt();
		
		sum = a + b; 
		System.out.println("Sum of "+a+" and "+b+" = "+sum);
		
	}
}
