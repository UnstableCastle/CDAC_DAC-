import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) 
			throws IOException{
		FileInputStream fis = 
			new FileInputStream("application.properties");
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p);
		String u = p.getProperty("user");
		System.out.println(u);
	}
}
