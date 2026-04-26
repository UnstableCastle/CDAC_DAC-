import java.util.*;

public class Balancing {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Expression");
		String exp = s.nextLine();

		MyStackChar c = new MyStackChar(exp.length());

		for (int i = 0; i < exp.length(); i++) {

			char current = exp.charAt(i);

			if ("[{(".indexOf(current) != -1) {
				c.push(current);
			}

			else if ("]})".indexOf(current) != -1) {

				if (c.isEmpty()) {
					System.out.println("Right parentheses are more");
					s.close();
					return;
				}

				char ch = c.pop();

				if (!match(ch, current)) {
					System.out.println("Type mismatch");
					s.close();
					return;
				}
			}
		}

		if (c.isEmpty()) {
			System.out.println("Expression is Balanced");
		} else {
			System.out.println("Left parentheses are more");
		}

		s.close();
	}

	private static boolean match(char a, char b) {
		return (a == '[' && b == ']') ||
		       (a == '{' && b == '}') ||
		       (a == '(' && b == ')');
	}
}