package PREP;

import java.util.Scanner;

public class StringDigitSum {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
	int sum = 0;
	
	for(char c:input.toCharArray()) {
		if(Character.isDigit(c)) {
			sum+=Character.getNumericValue(c);
		}
		
	}
	
	System.out.println(sum);
	sc.close();
	
}
}
