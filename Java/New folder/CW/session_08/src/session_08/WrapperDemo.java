package session_08;
public class WrapperDemo {	
	public static void main(String[] args) {		
		int no = 10;
		Integer i = new Integer(no);//Boxing
		
		int n = i.intValue();//UnBoxing
		
		//String to primitive
		String str = "100";
		int a = Integer.parseInt(str);
		
		//String to Wrapper
		Integer b = Integer.valueOf(str);
		
		//Auto-Boxing
		int s = 11;
		Integer d =  s;
		
		//Auto-Unboxing
		int m = d;	
	}
}
