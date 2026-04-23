package A3;

import java.util.*;
public class BHK {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	TwoBHK[] flat = new TwoBHK[3];
	for(int i=0;i<3;i++) {
		
		
		System.out.println("Enter Room1 Area , Hall Area , Price and Romm2 Area");
	double ra = s.nextDouble();
	double ha = s.nextDouble();
	double p =  s.nextDouble();
	double r2a = s.nextDouble();
	
	flat[i] = new TwoBHK(ra,ha,p,r2a);
	
	
	}
	
	double total = 0;
	System.out.println("\n flat details");
	for(int i = 0; i<3;i++) {
		
		flat[i].show();
		total+=flat[i].getPPrice();
	}
	
	System.out.println("\n Total amount of all flat = "+total);
	s.close();
}
}
