package session_06;
public class Demo {
	public static void msg()
	{
		try
		{
		int no = 10/0;
		System.out.println("no = "+no);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Occurred!!");
		}
	}
	
	public static void getMsg()
	{
		msg();
	}
	
	public static void main(String[] args) {	
		Demo.getMsg();
		System.out.println("End of Program");
	}
}
/*Exception in thread "main" java.lang.ArithmeticException:
 / by zero
at session_06.Demo.msg(Demo.java:7)
at session_06.Demo.getMsg(Demo.java:14)
at session_06.Demo.main(Demo.java:19)
*/

/*
try
{
//...
//....
}catch()
{
}



try
{
}
catch() {}
catch() {}


try
{
}
finally
{}



try
{
}
catch() {}
finally {}

*/

