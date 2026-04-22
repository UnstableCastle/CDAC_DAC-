import java.io.Console;
public class ConsoleDemo {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("Enter User Name : ");
		String str = console.readLine();
		System.out.println("Enter User Password :");
		char[] ch = console.readPassword();
		String pwd = String.valueOf(ch);
		System.out.println("User Name : "+str);
		System.out.println("Password  : "+pwd);
		
	}
}
