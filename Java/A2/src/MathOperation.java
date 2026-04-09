
import java.util.Scanner;

public class MathOperation {
	private int x;
	private int y;
	private int r;

	public MathOperation() {
		System.out.println("Default Constructor");

	}

	public void init(int x, int y) {
		this.x = x;
		this.y = y;
		r = 0;
	}

	public void add() {
		r = x + y;
//		System.out.println("Addition of X and Y = " + r);
	}

	public void multiply() {
		r = x * y;
//		System.out.println("Multiplication of X and Y = " + r);
	}

	public void power() {
		r = 1;
		for (int i = 1; i <= y; i++) {
			r *= x;
		}

//		System.out.println("Power of X and Y = " + r);
	}
	
	public void display(String funname) {
        System.out.println(funname + " Result: " + r);
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y;
		System.out.println("Enter Value for X :");
		x = s.nextInt();
		System.out.println("Enter Value for Y :");
		y = s.nextInt();

		MathOperation m = new MathOperation();

		m.init(x, y);
		m.add();
		m.display("add");
		m.multiply();
		m.display("multiply");
		m.power();
		m.display("power");
		
		s.close();

	}

}
