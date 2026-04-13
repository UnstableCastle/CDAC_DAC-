import java.util.Scanner;
public class AssertDemo {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age = s.nextInt();		
	
		assert age>18 : "You are not eligibale to Vote!!!";
		System.out.println("Welcome " +age);
		s.close();
		
	
	}
}
