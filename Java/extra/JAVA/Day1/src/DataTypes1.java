
public class DataTypes1 {

	public static void main(String[] args) {

		byte b = 127;
		int n = 257;
		b = (byte) n; // explicit type casting
		System.out.println(b + "explicit type casting");
		n = b; // implicit type casting
		System.out.println(n + "implicit type casting");

		byte b1 = 10;
		byte b2 = 30;

		n = b2 * b1; // type promotion

		System.out.println(n + "type promotion");

		float f = 10.2f;
		float avg = (float) 5 / 2;
		System.out.println("avg" + avg);

//		System.out.println(10/0);
		System.out.println(10/0.0);
		System.out.println(0.0/0.0);
		
		int a = 0b101;
		System.out.println(a);
		
		int c = 10;
		int d = c++;
		System.out.println(d);

		int e =++c;
		System.out.println(e);
		
		
		
		
	}
}
