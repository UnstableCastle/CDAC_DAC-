package InfowayFeb26;

public class RecursionFun2 {
	public static void fun1(int n) { //   1    2 
		 
		 
		 
		 if(n<1) return;
		 
		 fun1(n-1);
		 System.out.println(" n = "+n);
		 
		 
	 }
	 
	 
	 
	 public static void main(String []ar)
	 { 
		  fun1(5);
		  System.out.println("The End.....");
	 }
}
