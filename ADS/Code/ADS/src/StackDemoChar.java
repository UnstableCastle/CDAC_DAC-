import java.util.*;

public class StackDemoChar {

	public static void main(String[] args) {
		char c;
		char ch;
		MyStackChar st = new MyStackChar(8);
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter Choice ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			ch = s.next().charAt(0);

			switch (ch) {
			case '1':
				System.out.println("Enter cber to Push :");
				c = s.next().charAt(0);
				st.push(c);
				break;
			case '2':
				c = st.pop();
				if (c == -999) {
					System.out.println("element removed " + c);
				}
				break;

			case '3':
				st.peek();
				break;
			case '4':
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		} while (ch != '4');
s.close();
	}
}
