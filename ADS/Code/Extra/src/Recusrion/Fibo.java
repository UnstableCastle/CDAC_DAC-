package Recusrion;



public class Fibo {

	public static int  cal_fibo(int n) {
			
		if(n == 0) {return 0;}
		if(n == 1)return 1;
		
		return cal_fibo(n - 1)+cal_fibo(n -2);
		
		
		
		
	}
	
	public static void main(String[] args) {
		int num =7;
		for(int i =0;i<num;i++) {
			System.out.println(cal_fibo(i)+" ");
		}
	}
}
