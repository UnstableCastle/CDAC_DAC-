package session_06;
public class Demo4 {
	public static void main(String[] args) {
		A a = new A();
		double d;
		try
		{
			d = a.div(2, 5);
			if(d<1)
			{
				throw new MyException();
			}
			System.out.println("d = "+d);
		}catch (MyException e) {
			System.out.println(e);
		}
	}
}
