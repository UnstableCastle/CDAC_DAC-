package p1;
 class A {	
	//private int no;
	protected int no;
	
	public A()
	{
		no = 10;
	}
	
	 int getA()
	{
		return no;
	}
	
	  public static void main(String[] args) {  
	  A a = new A(); 
	  System.out.println(a.getA());  
	  }
}



