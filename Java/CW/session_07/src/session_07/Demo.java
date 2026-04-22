package session_07;

import java.text.DecimalFormat;

public class Demo {
	public static void main(String[] args) {	
		//StringBuffer sb = new StringBuffer("Hello");
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append(" World");
		System.out.println(sb);
		//sb.reverse();
		//System.out.println(sb);
		sb.replace(6, 11, "Java17");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Hello Infoway technologies"
				+ " kothrud Pune Maharashtra");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		double d = 10.6736473;
		System.out.println(String.format("%.2f", d));
	
		//import java.text.DecimalFormat;
		DecimalFormat df = new DecimalFormat("0.00");
		String str = df.format(d);
		System.out.println(str);
		
	}

}
