
public class Demo3 {

	public static void main(String[] args) {
		int a, b, c = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);

			c = a / b;
			System.out.println("c = " + c);

		} catch (Exception e) {

			if (e instanceof ArithmeticException) {
				System.out.println(" cannot divide by zero");
			} else if (e instanceof NumberFormatException) {
				System.out.println(" enter integral value ");
			}else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("enter atleast 2 values");
			}else
			{System.out.println("Error!!!");
				
			}
			

		}

	}

}
