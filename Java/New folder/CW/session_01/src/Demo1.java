public class Demo1 {
	public static void main(String[] args) {	
		byte b = 127;
		int n = 257;
		b =(byte) n;//Explicit Casting
		System.out.println(b);
		n = b;//Implicit Casting
		
		byte b1 = 10;
		byte b2 = 30;
		int i = b1*b2;//Type Promotion(byte*byte=int)
		
		float f = 10.2f;
		
		float avg1 = 5/2;//2.0(Data loss - implicit Casting)
		float avg =(float) 5/2;//2.5
		System.out.println("Avg = "+avg);
		
		 n = n+1;
		 n++;
		 n+=1;
		 
		// System.out.println(10/0);//ArithmeticException
		 System.out.println(10/0.0);//Infinity
		 System.out.println(0.0/0.0);//NaN(Not a number)
		 
		 int a = 0b101;
		 System.out.println(a);
		 
		 int c = 10;
		 int d = c++;
    System.out.println(c+" "+d);//first assign n then inc
		 
		 int e = ++c;//first inc and then assign
		 System.out.println(e+" "+c);
		 
		 double no = 1_00_000;	
	}
}
