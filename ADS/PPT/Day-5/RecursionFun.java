package InfowayFeb26;

public class RecursionFun {
	
	 public static void fun1(int n) { // n = 5   4   3   2      
		 
		                                  
		                                  
		 if(n<1) return;
		 System.out.println(" ");
		 starprint(n);
		 
		 fun1(n-1);
		 
		 
	 }
	 
	 public static void starprint(int n)
	 {
		 if(n==0) return;
		 System.out.print("*");
		 starprint(n-1);
	 }
	 
	 public static void main(String []ar)
	 { 
		  fun1(5);
		  System.out.println("\n The End.....");
	 }
	}
