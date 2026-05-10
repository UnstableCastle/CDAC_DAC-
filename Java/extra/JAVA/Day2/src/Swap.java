import java.util.Scanner;
public class Swap {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,t;
		System.out.println("Enter values : ");
		 
		a = s.nextInt();
		b = s.nextInt();
		
		t = a;
		a = b;
		b = t;
		
		System.out.println(a);
		System.out.println(b);

	}}
