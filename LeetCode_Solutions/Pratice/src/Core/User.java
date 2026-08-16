package Core;
//encapsulation


public class User {
	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	public User() {
		
	}

	public User(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public void setPassword(String password) {
		if(password.length()<8) {
			System.out.println("Password too short ,must be atleast 8 characters");
			return;
		}
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		u1.username="lubna";
		u1.password="abcd1234";
		
		System.out.println(u1);
	}
}
