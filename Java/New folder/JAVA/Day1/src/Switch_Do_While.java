import java.util.*;

public class Switch_Do_While {

	public static void main(String args[]) {
		
		int a ,b,c ; char ans,ch;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value for A :");
		a = s.nextInt();
		System.out.println("Enter Value for B :");
		b = s.nextInt();
		
		do {
			System.out.println("a. Addition\t"
					+ "b. Subtraction\t"
					+ "c. Multiplication\t"
					+ "d. Division");
			
			System.out.println("Enter Choice :");
			ch = s.next().charAt(0);
			
			switch(ch) {
			case 'a' : c = a+b;
						System.out.println("Sum of "+a+" and "+b+"="+c);
						break;
			case 'b' : if(a>b){
						c = a-b ;
						System.out.println("Diff of "+a+" - "+b+"="+c);
						break;
						}else {
							c = b-a ;
						System.out.println("Diff of "+b+" - "+a+"="+c);
						break;
						}
			case 'c' :	c = a+b;
						System.out.println("Sum of "+a+" and "+b+"="+c);
						break;
			case 'd' : if(b == 0) {
					   System.out.println("dinominator cannot be 0");
					   }else {
					   c = a+b;
					   System.out.println("Sum of "+a+" and "+b+"="+c);
						break;   
					   }
					   
			default  : System.out.println("enter vaild choice");
			}
			System.out.println("Do you want to continue (Y/N) ?");
			ans = s.next().charAt(0);
		}while(ans!='N');
		s.close();
		
	}

}