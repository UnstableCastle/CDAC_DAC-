public class B extends A{
	@Override
	public void m1()
	{
		System.out.println("In m1() of B");
	}
	
	@SuppressWarnings("unused")
	public void m2()
	{
		//@SuppressWarnings("unused")
		int y;
	}

	@Deprecated
	public void m3()
	{
		//....
	}
}
