package Queue;

import java.util.Scanner;

class intQueue{
	private int arr[];
	private int front;
	private int rear;
	
	public intQueue() {
		arr = new int[10];
		front = rear = -1;
		
	}
	
	public intQueue(int s) {
		arr = new int[s];
		front = rear = -1;
		
	}
	
	public boolean isFull() {
		
		if((rear==arr.length-1))
		return true;
	
		else 
			return false;
	}
	
	public boolean isEmpty() {
		if((front== -1)||(front == rear+1)) return true;
		else return false;
	}
	
	
public void insertQ(int d) {
	
	if(isFull()) {
		System.out.println("Queue is Full !!! : [ Overflow ]");
	return;
	}
	
	if(front == -1) front = 0;
	
	rear=rear+1;
	arr[rear]=d;
	return;
	
}

public int removeQ() {
	int d = -999;
	
	if(isEmpty()) {
		System.out.println("Queue is Empty !!! : [ Underflow ]");
		return d;
	}
	d =arr[front];
	front ++;
	
	return d;
}

public int peek() {
	int d = -999;
	
	if(isEmpty()) {
		System.out.println("Queue is Empty !!! : [ Underflow ]");
		return d;
	}
	d =arr[front];
	
	
	return d;
	
}
	
	
	
}//end of intqueue



public class MyQueue {

	public static void main(String[] args) {
		int num,n;
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length for Queue :");
		n = s.nextInt();
		intQueue q = new intQueue(n);
		
		do {
			System.out.println("Enter Choice ");
			System.out.println("1. Insert");
			System.out.println("2. Remove");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			ch = s.next().charAt(0);
			switch (ch) {
			case '1':
			    System.out.println("Enter Number to Insert:");
			    num = s.nextInt();
			    q.insertQ(num);
			    break;

			case '2':
			    num = q.removeQ();
			    if (num != -999) {
			        System.out.println("Element removed: " + num);
			    }
			    break;

			case '3':
			    num = q.peek();
			    if (num != -999) {
			        System.out.println("Front element: " + num);
			    }
			    break;

			case '4':
			    break;

			default:
			    System.out.println("Invalid choice!");
			}


		} while (ch != '4');

	s.close();
	}
}
