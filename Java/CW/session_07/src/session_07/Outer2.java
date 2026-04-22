package session_07;
public class Outer2 {
	private int n;
	
	public Outer2()
	{
		n = 111;
	}
	
	public void get()
	{
		int n = 1111;
		 class Inner2
		{
			 int n;
			 
			 public Inner2()
			 {
				 n = 11;
			 }
			 
			 public int getN()
			 {
				 return n;
			 }
			 
		}
		 Inner2 i = new Inner2();
		 System.out.println("n = "+i.getN());
	}
	
	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.get();	
	}
}
