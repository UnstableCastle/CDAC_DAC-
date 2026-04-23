import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriQueDemo {

public static void main(String[] args) {
//	PriorityQueue<Integer> p = new PriorityQueue<Integer>();
	Queue<Integer> p = new LinkedList<Integer>();
	System.out.println(p.size());
	System.out.println(p);
	
	for(int i =1;i<=10;i++) {
		
		p.offer(i);
		
	}
	System.out.println(p);
	p.offer(null);// NullPointerException : for PriorityQueue
	System.out.println(p);
	System.out.println(p.poll());
	System.out.println(p.poll());
	System.out.println(p.peek());
}
}
