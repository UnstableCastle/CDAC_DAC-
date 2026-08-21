package PREP;

import java.util.*;

public class WarehouseRobot {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String commands = sc.next();
	commands = commands.toUpperCase();
	
	int upDown=0;
	int leftRight = 0;
	
	for(char c:commands.toCharArray()) {
		if(c == 'U') {
			upDown++;
			} else if (c=='D') {
				upDown--;
				
			}else if (c =='R') {
				leftRight++;
			}else if (c =='L') {
				leftRight--;
			}
		
	}

	if( upDown == 0  && leftRight == 0) {
		System.out.println("Returned");
	}else {
		System.out.println("Stranded");
	}
	
	sc.close();

}
}
