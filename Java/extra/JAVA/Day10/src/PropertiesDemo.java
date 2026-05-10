import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("application.properties");
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p);
		String user  = p.getProperty("user");
		String pass  = p.getProperty("pass");
		System.err.println(user);
		System.err.println(pass);
	}
	
}
