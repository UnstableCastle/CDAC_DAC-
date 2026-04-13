
public class demo4 {
	public static void main(String[] args) {
		A a = new A();
		double d;

		try {

			d = a.div(10, 20);

			if (d < 1) {
				throw new MyException();
			}

			System.out.println("Result is: " + d);

		} catch (MyException e) {

			System.out.println(e);
		}
	}
}