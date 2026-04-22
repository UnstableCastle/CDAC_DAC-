
public class Math_Operation {

	
	public int multiply(int x,int y) {
		
		int c = x*y;
		return c;
			
	}
	public float multiply(float a , float b) {
		float c ;
		c = a*b;
		return c;
			
	}
	public double multiply(double a , float b) {
		double c ;
		
		c = a*b; 
		
		return c;
			
	}
	
	 public int multiply(int... a) {
	        int sum = 0;
	        for (int num : a) {  
	            sum += num;
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		
		Math_Operation m = new Math_Operation();
		
		System.out.println(m.multiply(2, 2)+" int , int");
		System.out.println(m.multiply(2.2f, 22.f)+" float , float");
		System.out.println(m.multiply(2,2,2,2,2,2,2)+" sum of array elements");
		System.out.println(m.multiply(2d, 2f)+" double , float");
		
	}
	

}
