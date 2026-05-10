
public class StringBuffer_BuilderDemo {

	public static void main(String[] args) {
		StringBuffer sb ;
//		sb = new StringBuffer();
//		System.out.println(sb.capacity()); //.............16
		
		
		
		sb = new StringBuffer("Hello");
		System.out.println(sb.capacity());
		
		sb.append(" World");
		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
		sb.replace(6, 11, "Java17");
		System.out.println(sb);
		sb.append("hello world welcome to the program");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
		
	}
}
