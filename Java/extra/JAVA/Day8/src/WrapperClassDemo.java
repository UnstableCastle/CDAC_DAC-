

public class WrapperClassDemo {
public static void main(String[] args) {
	
	int no  = 10;
	Integer i = new Integer(no);   //BOXING
	
	int n = i.intValue();
	System.out.println(n);
	
	//String To Primitive 
	String str = "100";
	int a = Integer.parseInt(str);
	System.out.println(a);
	
	//String to Wrapper
	
	Integer b = Integer.valueOf(str);
	System.out.println(b);
	
	//Auto-Boxing
	int s = 11;
	Integer d = s;
	System.out.println(s);
	System.out.println(d);
	//Auto-UnBoxing
	int m = d;
	System.out.println(m);
	
}
	
	
}
