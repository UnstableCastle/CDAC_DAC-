package session_11;
import java.util.Scanner;
public class Demo5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name = ");
		//String name = s.next();
		//System.out.println(name);
		String name = s.nextLine();
		System.out.println("Enter age : ");
		int age = s.nextInt();
		s.nextLine();
		System.out.println("Enter Subject: ");
		String subject = s.nextLine();
		System.out.println(name);
		System.out.println(age);
		System.out.println(subject);	
		s.close();
	}
}
