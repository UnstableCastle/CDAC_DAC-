import java.util.Scanner;
public class LeapYear {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int year;
		System.out.println("Enter Year : ");
		
		year = s.nextInt();
		 if((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
		 {
			 System.out.println(year+" is a Leap year");
		 }
		 else 
		 {
			 System.out.println(year+" is not a leap year");
		 }
	}
}
