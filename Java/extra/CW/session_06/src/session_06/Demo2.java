package session_06;
public class Demo2 {	
	public static void main(String[] args)//"10" "20"
	{
		int a,b,c = 0;
		try
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("c = "+c);
		}catch (ArithmeticException e) {
			System.out.println("Denominator should "
					+ "not be zero");
		}
		catch (NumberFormatException e) {
			System.out.println("Enter only integral data");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter atleast 2 values");
		}
		catch (Exception e) {
			System.out.println("ERROR!!");
		}
	}
}
