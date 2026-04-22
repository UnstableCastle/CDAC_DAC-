import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int max = (a>b)?a:(b>c)?b:c;
		
		System.out.println("Max = "+max);
		
		s.close();		
	}
}


