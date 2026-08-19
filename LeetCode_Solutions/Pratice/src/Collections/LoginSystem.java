package Collections;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {

	public static void main(String[] args) {
		
		Map<String, String> userDatabase = new HashMap<String, String>();
		userDatabase.put("alice_smith", "Password123");
		userDatabase.put("bob_jones", "SecurePass");
		userDatabase.put("admin", "admin");
		

		userDatabase.put("bob_jones", "NewPass456");
		
		String loginUser = "alice_smith";
		String loginPass = "Password123";
		
		if(userDatabase.containsKey(loginUser) &&
			userDatabase.get(loginUser).equals(loginPass)) {
		System.out.println("Login successful !!");
		}
		else {
			System.out.println("invalid creds");
		}
		
		
		for (String string : userDatabase.keySet()) {
			System.out.println(string);
		}
		
	}
}
