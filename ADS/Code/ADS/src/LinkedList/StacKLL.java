package LinkedList;

public class StacKLL {
private intNode top;

public StacKLL(){
	this.top = null ;
	
}

public boolean isEmpty(){
	return top == null;
}

public void push(int data) {
	intNode newNode = new intNode(data);
	newNode.setNext(top);
	top = newNode;
}
public int pop() {
	int d = -999;

	if (top == null)
		return d;

	intNode deletable = top;
	d = deletable.getData();
	top = top.getNext();

	deletable.setNext(null);
	deletable = null;

	return d;
}


public void display() {
	intNode itr = top;
	System.out.print("top");
	while (itr != null) {
		System.out.print(" -> "+ itr.getData());
		itr = itr.getNext();
	}
	System.out.println();

	
}


public void peek() {
	if (isEmpty()) {
        System.out.println("Stack is empty! Nothing to peek.");
        return;
    }
    
    System.out.println("element at top : " + top.getData());
   
}

public static void main(String[] args) {
	
	StacKLL sl = new StacKLL();
	
	sl.push(10);
	sl.push(20);
	sl.push(30);
	sl.display();
	sl.peek();
	sl.pop();
	sl.display();
	sl.peek();
	
	
	
	
	
	
}


}







