import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		char ch,ans;
		int a,b,c=0;
		do
		{
			System.out.println("a.Addition\tb.Substraction"
					+ "\tc.Multiplication\td.Division\t"
					+ "e.Exit");
			System.out.println("Enter your choice: ");
			ch = s.next().charAt(0);
			System.out.println("Enter any two numbers: ");
			a = s.nextInt();
			b = s.nextInt();
			
			switch(ch)
			{
			case 'a':
				c = a+b;
				System.out.println(a+"+"+b+"="+c);
				break;
			case 'b':
				if(a>b)
				{c = a-b;}
				else
				{c = b-a;}
				System.out.println(a+"-"+b+"="+c);	
				break;
			case 'c':
				c = a*b;
				System.out.println(a+"*"+b+"="+c);
				break;
			case 'd':
				if(b==0)
				{
					System.out.println("Denominator "
							+ "should not be Zero");
				}
				else
				{
				c = a/b;
				System.out.println(a+"/"+b+"="+c);
				}
				break;
			case 'e':
				System.exit(0);
				break;
				
			default:
				System.out.println("WRONG CHOICE!!!");
				
			}
			System.out.println("Do you want to"
					+ " Continue(Y/N)?");
			ans = s.next().charAt(0);
		}while(ans!='N');
		s.close();
	}
}
