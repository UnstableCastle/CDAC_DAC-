package session_07;

public class Outer1 {
	
private int no;
	
	public Outer1()
	{
		no = 100;
	}
	
	private class Inner//----Inner Class
	{
		private int n;
		
		public Inner()
		{
			n = 10;
		}
		
		public void getN()
		{
			System.out.println("no = "+no);
			System.out.println("n = "+n);
		}
	}
	
	public void get()
	{
		Inner i = new Inner();
		i.getN();
	}

	public static void main(String[] args) {
		
		Outer1 o = new Outer1();
		o.get();
		
	}
	
}
