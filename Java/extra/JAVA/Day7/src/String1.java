import java.text.DecimalFormat;

public class String1 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		System.out.println(s1);
//		s1 = s1.concat(" Programming");
//		System.out.println(s1);
		System.out.println(s1.length());
		String s2 = "Infoway";
		s2 = s2.concat(" Technologies Kothrud Pune Maharashtra");
		System.out.println(s1);
		String s3 = "java";
		String s4 = " Java";
		String s5 = "Java";
		
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s3==s4);
	
	System.out.println(s1.compareTo(s4));
	System.out.println(s1.compareToIgnoreCase(s3));
	System.out.println(s1.compareTo(s5));
	System.out.println(s1.endsWith("va"));
	System.out.println(s1.startsWith("Ja"));
	System.out.println(s3.toUpperCase());
	System.out.println(s5.toLowerCase());
	
	double d = 10.672398;
	System.out.println(d);
	System.out.println(String.format("%.2f ..string format ",d));
	DecimalFormat df = new DecimalFormat("0.00");
	String str = df.format(d);
	System.out.println(str+" ..decimal format");
	



	
	}
}
