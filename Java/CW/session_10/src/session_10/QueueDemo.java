package session_10;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {	
		//PriorityQueue<Integer> q =
					//new PriorityQueue<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println(q.size());
		for(int i=1;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		q.offer(10);
		//q.offer(null);java.lang.NullPointerException
		System.out.println(q);
		
	}
	
}
