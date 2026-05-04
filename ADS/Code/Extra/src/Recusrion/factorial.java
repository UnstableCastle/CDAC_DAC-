package Recusrion;



public class factorial {
	
	

public static int calfact(int num) {
	
	int fact = 1;
	for(int i = num;i>0;i--) {
		
		fact*=i;
		
	}
	return fact;
}

public static int rec_fact(int num) {
	if(num == 1 || num == 0 ) {
		return 1;
	}
	else {
		return num*rec_fact(num-1);
	}
}
	
	
 
	public static void main(String[] args) {
System.out.println("hello");
System.out.println("fact = "+calfact(5));
System.out.println("fact = "+rec_fact(5));
}
}
