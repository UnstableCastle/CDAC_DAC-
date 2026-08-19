package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class HelpdeskSystem {
public static void main(String[] args) {
	
	
	Queue<String> tickets = new LinkedList<String>();
	
	tickets.offer("Alice - cannot login");
	tickets.offer("Bob - Payment Failed ");
	tickets.offer("Charlie - Page not Loading");
	
	System.out.println(tickets.peek());
	
	while(!tickets.isEmpty()) {
		System.out.println("Ticket name :"+tickets.peek());
		tickets.poll();
		
	}
	System.out.println("All tickets resolved, queue size "+tickets.size());
}
}
