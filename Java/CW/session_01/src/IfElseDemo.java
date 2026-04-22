import java.util.Scanner;
public class IfElseDemo {	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks Obtained: ");
		int marks = s.nextInt();
		if(marks>=75)
		{
			System.out.println("Distinction!!!");
		}
		else if((marks<75)&&(marks>=65))
		{
			System.out.println("First Class");
		}
		else if((marks<65)&&(marks>=55))
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("FAIL!!");
		}
		s.close();
	}
}
