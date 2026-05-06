package InfowayFeb26;

import java.util.Scanner;

public class DetectCycleAndRemove {

	public static void main(String[] args) {
		linkedlist_int ll1 = new linkedlist_int();
		int d;
		Scanner sc = new Scanner(System.in);
		listNodeInt iter, slow, fast, p1, p2, C = null, prev;
		ll1.insert_last(10);
		ll1.insert_last(20);
		ll1.insert_last(30);
		ll1.insert_last(40);
		ll1.insert_last(50);
		ll1.insert_last(60);
		ll1.insert_last(70);
		System.out.println(ll1);
		System.out.println("Enter node value for cycle :");
		d = sc.nextInt();
		iter = ll1.getHead();
		prev = null;
		while(iter!=null)
		{
			prev = iter;
			if(iter.getData() == d) C = iter;
			iter = iter.getNext();
		}
		prev.setNext(C);
		System.out.println(C.getData());
		slow = fast = ll1.getHead();
		C = null;
		while(fast != null && fast.getNext()!=null)
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow == fast) { C = slow; break; }
		}
		if( C != null)
		      System.out.println("\nCycle detected : " + C.getData());
		if(C==null)
		{
			System.out.println("\nNo cycle in LL ");
			return;
		}
		int cycleLen = 0;
		p1 = p2 = C;
		do {
			cycleLen++;
			p2 = p2.getNext();
		}while(p1 != p2);
		System.out.println("\nCycle Length = "+cycleLen);
		
		p1 = ll1.getHead();
		int remLen = 0;
		while(p1!=p2)
		{
		     remLen++;
		     p1=p1.getNext();
		     p2=p2.getNext();
		}
		System.out.println("\nRemaining = "+remLen);
		int totalLen = cycleLen + remLen;
		iter = ll1.getHead();
		for(int i = 1 ; i < totalLen ;i++)
			iter = iter.getNext();
	    
		iter.setNext(null);
		System.out.print("Cycle Removed : ");
		System.out.println(ll1);
	}

}
