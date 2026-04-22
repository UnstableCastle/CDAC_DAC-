package session_06;

import java.util.Scanner;
public class AssertDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s.nextInt();
		
		assert age>18 :"You are not eligible for voting";
		
		System.out.println("Welcome: "+age);
		s.close();
	}
}
