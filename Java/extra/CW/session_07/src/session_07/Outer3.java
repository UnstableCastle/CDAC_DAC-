package session_07;
public class Outer3 {
	private int n1;
	private static int n2;
	public Outer3()
	{
		n1 = 10;
	}
	static 
	{
		n2 = 100;
	}
	public static class Inner3
	{
		private int n = 100;
		
		public void get()
		{
			//System.out.println("n1 = "+n1);CTE
			System.out.println("n2 = "+n2);	
		}
	}
	public static void main(String[] args) {	
		Outer3.Inner3 i = new Outer3.Inner3();
		i.get();
	}
}
