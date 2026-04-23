package session_09;
import java.util.Stack;
public class StackDemo {	
	public static void main(String[] args) {	
		Stack s = new Stack();
		s.push(10);
		s.push('A');
		s.push("ABC");
		s.push(10);
		s.push(null);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.search("ABC"));
		System.out.println(s.search('B'));//-1
	}
}
/*
10
ABC
A
10
*/