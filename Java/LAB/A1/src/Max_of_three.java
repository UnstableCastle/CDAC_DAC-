import java.util.*;
public class Max_of_three {

	public static void main(String args[]) {
		
		int a , b , c ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value for A B C");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
//		if((a>b)&&(a>c)) {
//			System.out.println(a+" is Maximum");
//		}
//		else if((b>a)&&(b>c)) {
//			System.out.println(b+" is Maximum");
//			}
//		else {
//			System.out.println(c+" is Maximum");
//		}
		
		int max = (a>b)?a:(b>c)?b:c;
		System.out.println("max = "+max);
		
	}
}
