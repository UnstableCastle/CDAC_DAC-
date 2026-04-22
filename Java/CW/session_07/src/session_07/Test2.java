package session_07;
public class Test2 {
	public static void main(String[] args) {
		String s1 = "Java";
		System.out.println(s1);
		s1 = s1.concat(" Programming");
		System.out.println(s1);
		
		String s2 = new String("Infoway");
		System.out.println(s2);
		s2.concat(" Technologies");
		System.out.println(s2);
		
		System.out.println(s1.length());
		
		String s3 = "java";
		String s4 = " Java ";
		String s5 = "Java";
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//false
		System.out.println(s3 == s4);//false
		System.out.println(s1 == s5);//true
		
		System.out.println(s1.compareTo(s4));//
		System.out.println(s1.compareToIgnoreCase(s3));//
		System.out.println(s1.compareTo(s5));//
		
		//s1.charAt(1);
		//s1.endsWith(String);
		//s1.contains(s5);
		
		System.out.println(s1.equals(s3));//
		System.out.println(s1.equalsIgnoreCase(s3));//
		
		//s1.startsWith();
		//s1.toUpperCase();
		//s1.toLowerCase();
		System.out.println(s4.length());
		System.out.println(s4.trim().length());
		
		//s1.toCharArray();
		System.out.println(s1.substring(5, 16));
		
		//s1.endsWith();
	}
}
