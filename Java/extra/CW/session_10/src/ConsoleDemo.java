import java.io.Console;
public class ConsoleDemo {	
	public static void main(String[] args) {
		
		Console console = System.console();
		System.out.println("Enter username : ");
		String user = console.readLine();
		System.out.println("Username: "+user);
		System.out.println("Enter Password: ");
		char ch[] =  console.readPassword();
		String pwd = String.valueOf(ch);
		System.out.println("Password = "+pwd);
	}
}
