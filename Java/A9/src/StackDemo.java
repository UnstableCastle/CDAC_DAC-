import java.util.Stack;

public class StackDemo {

public static void main(String[] args) {
	
	Stack s = new Stack();
	s.push(10);
	s.push(null);
	s.push("abc");
	s.push('A');
	s.push(10.2f);
	
	System.out.println(s);
	System.out.println(s.search(null));
	System.out.println(s.search('B'));
	
	
}
}
