package session_11;
import java.util.regex.Pattern;
public class Demo {
	public static void main(String[] args) {
		String str = "Learning Java Programming Language";
		String s[] = str.split("\s");
		for(String i:s)
		{
			System.out.println(i);
		}
		
		String s1 = "10,20,30";
		
	System.out.println(Pattern.matches(".ava", "jav"));
	}
}
