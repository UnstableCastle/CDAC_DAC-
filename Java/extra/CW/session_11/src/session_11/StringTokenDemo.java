package session_11;

import java.util.StringTokenizer;

public class StringTokenDemo {
	
	public static void main(String[] args) {
		String str = "java=mayuri;"+"mysql=rahul;";
		StringTokenizer st = new StringTokenizer(str,"=;");
		//st.hasMoreTokens()//boolean
		String c = st.nextToken();
		String nm = st.nextToken();
		System.out.println(c+" "+nm);
	}

}
