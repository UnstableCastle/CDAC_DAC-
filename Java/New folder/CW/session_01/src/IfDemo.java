import java.util.Scanner;
public class IfDemo {	
	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		int num;
		System.out.println("Enter a Number: ");
		num = s.nextInt();
		
		if((num%2) == 0)
		{
			System.out.println(num+" is a even no");
		}
		else
		{
			System.out.println(num+" is a Odd Num");
		}
		s.close();
	}
}
