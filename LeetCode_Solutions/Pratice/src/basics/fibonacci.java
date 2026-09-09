package basics;

public class fibonacci {

	public static int doFibonacci(int n ) {
		if(n <= 1) return n;
		
		int a = 0 ;
		int b = 1 ;
		int sum = 0;
		
		for(int i = 2; i<=n;i++) {
			sum = a+b;
			a = b ;
			b = sum;
		}
			
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int num = 8;
		System.out.println(doFibonacci(num));
		
	}
	
	
}
