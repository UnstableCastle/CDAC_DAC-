import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "Learnig Java Programming Language";
		String s[] = str.split("//s");
		for(String i:s) {
			System.out.println(i);
		}
		
		int sum = 0;
        String s1 = "10,20,30";
        String s2[] = s1.split(",");
        
        for(int i = 0; i < s2.length; i++) {
           
            sum += Integer.parseInt(s2[i]);
            
        }
        System.out.println("Sum = " + sum);
        
        
        System.out.println(Pattern.matches("[A-Za-z0-9]{0,9}+", "Castle111111"));
        
        
    }
}
