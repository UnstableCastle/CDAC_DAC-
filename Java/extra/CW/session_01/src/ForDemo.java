import java.util.Scanner;
public class ForDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = s.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;//fact = fact * i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
		s.close();
	}
}
/*
for(init;condition;inc/dec)
{
	//stmts;
}
//....
*/