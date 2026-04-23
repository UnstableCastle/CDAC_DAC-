package session_05;

public class Test1 {
	
	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println(b.getROI());
		
		//cannot be instantiated
		Bank bank = new Bank();//CTE
	}

}
