package Queue;

public class intQueue{
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
	
	
	
}