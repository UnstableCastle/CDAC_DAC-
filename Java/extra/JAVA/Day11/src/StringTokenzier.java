import java.util.StringTokenizer;

public class StringTokenzier {
public static void main(String[] args) {
	
	

	String str = "User: Castle Pass: 1234 ;"+"User: Strlizia Pass:1234;" ;

	StringTokenizer st = new StringTokenizer(str,";");
	while(st.hasMoreTokens())
	{
//		String a = st.nextToken();
		String b  = st.nextToken();
		
		System.err.println(/*a+*/"\n"+b);
		
	}

	
	
	
}

}
