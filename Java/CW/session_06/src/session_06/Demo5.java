package session_06;
import java.io.*;
public class Demo5 {
	public static void main(String[] args) 
			throws IOException {
		//FileOutputStream fos = 
		//new FileOutputStream("d://abc.txt");
		//FileOutputStream fos = 
		//new FileOutputStream("abc.txt");
		FileOutputStream fos = 
				new FileOutputStream("abc.txt",true);
		//fos.write(65);
		String str = "Hello my name is Java 12";
		byte b[] = str.getBytes();
		fos.write(b);
		System.out.println("Success");
		fos.close();				
	}
}
