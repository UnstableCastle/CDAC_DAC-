import java.util.Scanner;
public class Max_of_two_num {
	public static void main(String[]args) {
		
		int a ,b ; 
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER VALUE FOR a AND b : ");
		a = s.nextInt();
		b = s.nextInt();
//		
//		if(a>b) {
//			System.out.println(a+" is Greater");
//		}
//		else {
//			System.out.println(b+" is Greater");
//			
//		}
		
		int max = (a>b)?a:b;
		System.out.println("MAX = "+max);
		
	}
	
}
