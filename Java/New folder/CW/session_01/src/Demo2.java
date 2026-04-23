import java.util.Scanner;
public class Demo2 {	
	public static void main(String[] args) {	
		//get Scanner
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		//?: - ternary Operator(Conditional)
		int max = (a>b)?a:b;
		System.out.println("Max = "+max);	
		s.close();	
	}
}
