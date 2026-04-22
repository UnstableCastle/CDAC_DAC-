package session_07;
public class Outer //----Outer Class
{
	private int no;
	
	public Outer()
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
	
	public static void main(String[] args) {	
		//Outer o = new Outer();
		//Inner i = o.new Inner();
		Inner i = new Outer().new Inner();
		i.getN();	
	}
}
