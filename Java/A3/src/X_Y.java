
public class X_Y {
 
	
	public static void main(String[] args) {
		
		int x ,y,z;
		x = 1;
		y=x++ + ++x; 
		System.out.println(y);
		
		 z= x++ - --y - --x + x++; 
		 System.out.println(z);
		 
//		 z = (x && y) || !(x||y)
		System.out.println(z);
		
		
	}
}
