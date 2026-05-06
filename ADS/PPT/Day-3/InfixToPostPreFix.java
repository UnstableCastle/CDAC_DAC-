package for_DSA;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostPreFix {
	static String infix, postfix, prefix;

	public static int precedence(char symbol) {
		switch (symbol) {
		case '(':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '^':
			return 3;

		default:
			return 0;
		}
	}

	static int pow(int n, int m) {
		int p = 1;
		for (int i = 1; i <= m; i++)
			p = p * n;

		return p;
	}

	static void infix_to_postfix() {
		Stack<Character> st = new Stack<Character>();
		int i, p = 0;
		char symbol, next;
		char[] in = new char[50];
		char[] post = new char[50];
		System.out.println(infix);
		in = infix.toCharArray();
		for (i = 0; i < in.length; i++) {
			symbol = in[i];
			if (symbol != 32) {
				switch (symbol) {
				case '(':
					st.push(symbol);
					break;
				case ')':
					while ((next = st.pop()) != '(')
						post[p++] = next;
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':

					while ((!st.isEmpty()) && (precedence(st.peek()) >= precedence(symbol)))
						post[p++] = st.pop();

					st.push(symbol);
					break;
				default: // operand is in symbol
					post[p++] = symbol;
				}// end of switch
			} // end of if
			System.out.println(st);
		} // end of for

		while (!st.isEmpty())
			post[p++] = st.pop();

		post[p] = '\0';
		postfix = new String(post);
		System.out.println("Postfix inside function " + postfix);
	}// end of function

	static int eval_post() {
		intStack st = new intStack();
		int a = 0, b = 0, result = 0;
		int i;

		char[] post = new char[50];
		post = postfix.toCharArray();
		for (i = 0; i < post.length; i++) {
			if (post[i] >= '0' && post[i] <= '9')
				st.push(post[i] - 48);
			else {
				if (!st.isEmpty())
					a = st.pop();
				if (!st.isEmpty())
					b = st.pop();
				switch (post[i]) {
				case '+':
					result = b + a;
				case '-':
					result = b - a;
				case '*':
					result = b * a;
				case '/':
					result = b / a;
				case '%':
					result = b % a;
				case '^':
					result = pow(b, a);
				}
				st.push(result);
			} // end of else
		} // end of for
		result = st.pop();
		return result;
	}// end of function

	public static void infix_to_prefix() {
		charStack st = new charStack();
		int i, j, p = 0;
		char symbol, next, temp;
		char[] in = new char[50];
		char[] pre = new char[50];

		in = infix.toCharArray();
		for (i = in.length - 1; i >= 0; i--) {
			symbol = in[i];
			if (symbol != 32) {
				switch (symbol) {
				case ')':
					st.push(symbol);
					break;
				case '(':
					while ((next = st.pop()) != ')')
						pre[p++] = next;
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':

					while ((!st.isEmpty()) && (precedence(st.peek()) > precedence(symbol)))
						pre[p++] = st.pop();

					st.push(symbol);
					break;
				default: // operand is in symbol
					pre[p++] = symbol;
				}// end of switch
			} // end of if
		} // end of for

		while (!st.isEmpty())
			pre[p++] = st.pop();

		for (j = p - 1, i = 0; i < j; i++, j--) {
			temp = pre[i];
			pre[i] = pre[j];
			pre[j] = temp;
		}
        pre[i] = '\0';
		prefix = new String(pre);
	}// end of function

	static int eval_pre() {
		intStack st = new intStack();
		int a = 0, b = 0, result = 0;
		int i;

		char[] pre = new char[50];
		pre = prefix.toCharArray();
		for (i = pre.length - 1; i >= 0; i--) {
			if (pre[i] >= '0' && pre[i] <= '9')
				st.push(pre[i] - 48);
			else {
				if (!st.isEmpty())
					a = st.pop();
				if (!st.isEmpty())
					b = st.pop();
				switch (pre[i]) {
				case '+':
					result = b + a;
				case '-':
					result = b - a;
				case '*':
					result = b * a;
				case '/':
					result = b / a;
				case '%':
					result = b % a;
				case '^':
					result = pow(b, a);
				}
				st.push(result);
			} // end of else
		} // end of for
		result = st.pop();
		return result;
	}// end of function

	static boolean white_space(char symbol) {
		if (symbol == ' ' || symbol == '\t' || symbol == '\0')
			return true;
		else
			return false;
	}/* End of white_space() */

	/*
	 * static void prefix_to_postfix() { int i; Stack<String> st = new
	 * Stack<String>(); char operand1[] = new char[25], operand2[] = new char[25];
	 * char symbol; char temp[]=new char[2]; char strin[]= new char[25];
	 * for(i=prefix.length()-1;i>=0;i--) { symbol=prefix.charAt(i); temp[0]=symbol;
	 * temp[1]='\0';
	 * 
	 * if(!white_space(symbol)) { switch(symbol) { case '+': case '-': case '*':
	 * case '/': case '%': case '^': strcpy(operand1,st.pop());
	 * strcpy(operand2,pop()); strcpy(strin,operand1); strcat(strin,operand2);
	 * strcat(strin,temp); push(strin); break; default: if an operand comes
	 * push(temp); } } } printf("Postfix : "); puts(stack[0]); }End of
	 * prefix_to_postfix()
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter infix expression: ");
		infix = sc.next();
		System.out.println(" in main infix is " + infix);
		infix_to_postfix();
		System.out.println("Postfix = " + postfix);
		infix_to_prefix();
		System.out.println("Prefix = " + prefix);
		sc.close();

	}

}
