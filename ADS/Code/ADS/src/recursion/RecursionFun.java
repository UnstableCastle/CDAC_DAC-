//package recursion;
//public class RecursionFun {
//	
//	 public static void fun1(int n) { // n = 5   4   3   2   1
//		 
//		                                  
//		                                  
//		 if(n==6) return;
//		 System.out.println(" ");

//		 starprint(n);
//		 
//		 fun1(n+1);
//		 
//		 
//	 }
//	 
//	 public static void starprint(int n)
//	 {
//		 if(n==0) return;
//		 System.out.print("*");
//		 starprint(n-1);
//		 
//	 }
//	 
//	 public static void main(String []ar)
//	 { 
//		  fun1(1);
//		  System.out.println("\n The End.....");
//	 }
//	}
package recursion;

public class RecursionFun {
    
    public static void fun1(int n, int total) {
        if (n == 0) return; 
        
        printSpaces(total - n);
        
        starprint(n);
        
        System.out.println();
        
        fun1(n - 1, total);
    }

    public static void printSpaces(int count) {
        if (count <= 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    public static void starprint(int n) {
        if (n == 0) return;
        System.out.print("*");
        starprint(n - 1);
    }

    public static void main(String[] args) {
        int startingStars = 5;
        fun1(startingStars, startingStars);
        System.out.println("\n The End.....");
    }
}